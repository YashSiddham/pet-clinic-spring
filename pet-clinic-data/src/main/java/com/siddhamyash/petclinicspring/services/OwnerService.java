package com.siddhamyash.petclinicspring.services;

import com.siddhamyash.petclinicspring.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);
}
