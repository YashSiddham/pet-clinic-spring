package com.siddhamyash.petclinicspring.service;

import com.siddhamyash.petclinicspring.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);
}
