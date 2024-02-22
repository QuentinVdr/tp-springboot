package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Column(name = "type")
    private ProdType type;

    @Column(name = "price")
    private Double price;
}
