package com.siddhamyash.petclinicspring.service.map;

import java.util.*;

public abstract class AbstractMapService<ID, T> {

    protected Map<ID,T> map = new HashMap<>();

    Set<T> findAll(){
//        return new HashSet<>(map.values());
//        Class<T> actualTypeArgument = (Class<T>) ((ParameterizedType) getClass()
//                .getGenericSuperclass()).getActualTypeArguments()[0];
        //actualTypeArgument.getName()
        return new HashSet<>(map.values());
    }

    T findById(ID id){
//        return map.get(id);
        return map.get(id);
    }

    T save(ID id, T object){
        map.put(id, object);
        //map.put(object, id);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
