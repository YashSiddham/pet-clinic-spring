package com.siddhamyash.petclinicspring.service.map;

import com.siddhamyash.petclinicspring.model.Owner;
import com.siddhamyash.petclinicspring.service.OwnerService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
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
        return super.save(object);
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
