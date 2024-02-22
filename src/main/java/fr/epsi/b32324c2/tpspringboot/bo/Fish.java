package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fish")
public class Fish extends Animal {
    @Column(name = "water_type")
    private FishLiveEnv livingEnv;
}
