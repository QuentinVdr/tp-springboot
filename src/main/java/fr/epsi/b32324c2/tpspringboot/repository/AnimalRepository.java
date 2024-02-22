package fr.epsi.b32324c2.tpspringboot.repository;

import fr.epsi.b32324c2.tpspringboot.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByPetStoreId(Long id);
}
