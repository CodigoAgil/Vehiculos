package com.codigoagil.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Vehiculo.
 */
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	/** The id vehiculo. */
	@Id
	@Column(name = "idVehiculo", nullable = false)
	private Long idVehiculo;

	/** The marca. */
	@Column(name = "marca", length = 50, nullable = false)
	private String marca;

	/** The modelo. */
	@Column(name = "modelo", length = 50, nullable = false)
	private String modelo;

	/** The matricula. */
	@Column(name = "matricula", length = 50, nullable = false)
	private String matricula;

	/** The kilometraje. */
	@Column(name = "kilometraje", nullable = false)
	private int kilometraje;

	/**
	 * Instantiates a new vehiculo.
	 *
	 * @param idVehiculo the id vehiculo
	 * @param marca the marca
	 * @param modelo the modelo
	 * @param matricula the matricula
	 * @param kilometraje the kilometraje
	 */
	public Vehiculo(final Long idVehiculo, final String marca, final String modelo, final String matricula, final int kilometraje) {
		super();
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.kilometraje = kilometraje;
	}

	/**
	 * Instantiates a new vehiculo.
	 */
	public Vehiculo() {
		super();
	}

	/**
	 * Gets the id vehiculo.
	 *
	 * @return the id vehiculo
	 */
	public Long getIdVehiculo() {
		return this.idVehiculo;
	}

	/**
	 * Sets the id vehiculo.
	 *
	 * @param idVehiculo the new id vehiculo
	 */
	public void setIdVehiculo(final Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	/**
	 * Gets the marca.
	 *
	 * @return the marca
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Sets the marca.
	 *
	 * @param marca the new marca
	 */
	public void setMarca(final String marca) {
		this.marca = marca;
	}

	/**
	 * Gets the modelo.
	 *
	 * @return the modelo
	 */
	public String getModelo() {
		return this.modelo;
	}

	/**
	 * Sets the modelo.
	 *
	 * @param modelo the new modelo
	 */
	public void setModelo(final String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Gets the matricula.
	 *
	 * @return the matricula
	 */
	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * Sets the matricula.
	 *
	 * @param matricula the new matricula
	 */
	public void setMatricula(final String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Gets the kilometraje.
	 *
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return this.kilometraje;
	}

	/**
	 * Sets the kilometraje.
	 *
	 * @param kilometraje the new kilometraje
	 */
	public void setKilometraje(final int kilometraje) {
		this.kilometraje = kilometraje;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.idVehiculo, this.kilometraje, this.marca, this.matricula, this.modelo);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		final Vehiculo other = (Vehiculo) obj;
		return Objects.equals(this.idVehiculo, other.idVehiculo) && this.kilometraje == other.kilometraje && Objects.equals(this.marca, other.marca)
				&& Objects.equals(this.matricula, other.matricula) && Objects.equals(this.modelo, other.modelo);
	}

}
