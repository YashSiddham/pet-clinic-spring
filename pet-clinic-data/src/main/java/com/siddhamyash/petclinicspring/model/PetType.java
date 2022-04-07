package com.siddhamyash.petclinicspring.model;

public class PetType extends BaseEntity{

    private String name;

    public PetType(String petType) {
        this.name = petType;
    }

    public String getPetType() {
        return name;
    }

    public void setPetType(String petType) {
        this.name = petType;
    }
}
