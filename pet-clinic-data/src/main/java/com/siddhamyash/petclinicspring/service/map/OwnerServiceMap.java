package com.siddhamyash.petclinicspring.service.map;

import com.siddhamyash.petclinicspring.model.Owner;
import com.siddhamyash.petclinicspring.model.Pet;
import com.siddhamyash.petclinicspring.service.OwnerService;
import com.siddhamyash.petclinicspring.service.PetService;
import com.siddhamyash.petclinicspring.service.PetTypeService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
//        return super.deleteById(id);
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
//        return super.delete(object);
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
//        object.setId(object.getId()+1000);

        if(object != null){
            if(object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw new RuntimeException("Need a valid Pet Type.");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else{
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return null;
    }
}
