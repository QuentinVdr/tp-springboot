package fr.epsi.b32324c2.tpspringboot.repository;

import fr.epsi.b32324c2.tpspringboot.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
