package com.siddhamyash.petclinicspring.service.map;

import com.siddhamyash.petclinicspring.model.Specialty;
import com.siddhamyash.petclinicspring.model.Vet;
import com.siddhamyash.petclinicspring.service.SpecialityService;
import com.siddhamyash.petclinicspring.service.VetService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
//        return super.deleteById(id);
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
//        return super.delete(object);
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object != null){
            if(object.getSpecialties() != null){
                object.getSpecialties().forEach(speciality -> {
                    if(speciality.getDescription() != null){
                        if(speciality.getId() == null){
                            Specialty savedSpeciality = specialityService.save(speciality);
                            speciality.setId(savedSpeciality.getId());
                        }

                    }
                });
            }else{
                throw new RuntimeException("Speciality is required");
            }
            return super.save(object);
        }else{
            throw new RuntimeException("A valid object is required");
        }
//        object.setId(object.getId()+1000);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

}
