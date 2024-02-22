package fr.epsi.b32324c2.tpspringboot.repository;

import fr.epsi.b32324c2.tpspringboot.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
