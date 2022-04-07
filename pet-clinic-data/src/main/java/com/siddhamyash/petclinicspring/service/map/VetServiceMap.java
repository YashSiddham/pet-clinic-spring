package com.siddhamyash.petclinicspring.service.map;

import com.siddhamyash.petclinicspring.model.Vet;
import com.siddhamyash.petclinicspring.service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Long, Vet> implements VetService {
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
//        object.setId(object.getId()+1000);
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

}