package com.codigoagil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigoagil.model.Vehiculo;
import com.codigoagil.repository.VehiculoRepository;

/**
 * The Class VehiculoServiceImpl.
 */
@Service
public class VehiculoServiceImpl implements VehiculoService {

	/** The vehiculo repository. */
	@Autowired
	private VehiculoRepository vehiculoRepository;

	/**
	 * Gets the all vehiculos.
	 *
	 * @return the all vehiculos
	 */
	@Override
	public List<Vehiculo> getAllVehiculos() {
		return this.vehiculoRepository.findAll();
	}

}
