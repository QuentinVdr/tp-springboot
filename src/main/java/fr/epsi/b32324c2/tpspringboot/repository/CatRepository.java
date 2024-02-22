package fr.epsi.b32324c2.tpspringboot.repository;

import fr.epsi.b32324c2.tpspringboot.bo.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
