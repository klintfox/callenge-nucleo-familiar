package com.springboot.commons.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_parentesco")
public class Pariente implements Serializable {

	private static final long serialVersionUID = -8053678648349574313L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@Column(name = "apellido_paterno", length = 25)
	private String apellidoPaterno;

	@Column(name = "apellido_materno", length = 25)
	private String apellidoMaterno;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentesco_id", referencedColumnName = "id")
	private TipoParentesco tipoParentesco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public TipoParentesco getTipoParentesco() {
		return tipoParentesco;
	}

	public void setTipoParentesco(TipoParentesco tipoParentesco) {
		this.tipoParentesco = tipoParentesco;
	}

}