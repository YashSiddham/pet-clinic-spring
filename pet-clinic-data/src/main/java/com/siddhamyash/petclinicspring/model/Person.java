package com.siddhamyash.petclinicspring.model;

import lombok.*;

@Getter
@Setter
@ToString
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

}
