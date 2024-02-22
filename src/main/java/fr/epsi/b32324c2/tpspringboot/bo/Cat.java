package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cat")
public class Cat extends Animal {

    @Column(name = "claws")
    private String chipId;
}
