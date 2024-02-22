package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cat")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cat extends Animal {

    @Column(name = "claws")
    private String chipId;
}
