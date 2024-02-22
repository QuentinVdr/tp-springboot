package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "pet_store")
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "manager_name")
    private String managerName;
}
