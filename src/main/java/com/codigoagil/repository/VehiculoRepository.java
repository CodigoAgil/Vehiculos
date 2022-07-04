package com.codigoagil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codigoagil.model.Vehiculo;

/**
 * The Interface VehiculoRepository.
 */
@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
