package com.siddhamyash.petclinicspring.service.map;

import com.siddhamyash.petclinicspring.model.Specialty;
import com.siddhamyash.petclinicspring.service.CrudService;
import com.siddhamyash.petclinicspring.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Specialty, Long> implements SpecialityService{

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
