package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "birth")
    private LocalDate birth;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "id_pet_store", referencedColumnName = "id")
    private PetStore petStore;
}
