package fr.epsi.b32324c2.tpspringboot.repository;

import fr.epsi.b32324c2.tpspringboot.bo.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
