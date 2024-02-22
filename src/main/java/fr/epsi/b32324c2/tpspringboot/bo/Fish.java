package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fish")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fish extends Animal {
    @Column(name = "water_type")
    private FishLiveEnv livingEnv;
}
