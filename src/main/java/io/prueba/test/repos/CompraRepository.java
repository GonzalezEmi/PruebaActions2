package io.prueba.test.repos;

import io.prueba.test.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompraRepository extends JpaRepository<Compra, Integer> {
}
