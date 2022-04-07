package com.siddhamyash.petclinicspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class BaseEntity implements Serializable {
    private Long id;
}
