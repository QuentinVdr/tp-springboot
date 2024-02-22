package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.*;

import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "pet_store_product",
            joinColumns = @JoinColumn(name = "id_pet_store", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
    )
    private List<Product> Products;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petStore")
    private List<Animal> Animals;
}
