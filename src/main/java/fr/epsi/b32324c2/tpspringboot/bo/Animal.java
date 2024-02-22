package fr.epsi.b32324c2.tpspringboot.bo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "birth")
    private LocalDateTime birth;

    @Column(name = "color")
    private String color;
}
