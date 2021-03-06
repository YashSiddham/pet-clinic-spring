package com.siddhamyash.petclinicspring.service.map;
import com.siddhamyash.petclinicspring.model.Pet;
import com.siddhamyash.petclinicspring.service.PetService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
//        return super.deleteById(id);
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
//        return super.delete(object);
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
//        object.setId(object.getId()+1000);
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
