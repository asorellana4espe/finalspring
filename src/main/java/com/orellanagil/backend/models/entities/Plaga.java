package com.orellanagil.backend.models.entities;

import java.io.Serializable;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Plagas")
@Entity
public class Plaga{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_plaga")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idplaga;
	@Column(name="Nombre_científico")
	private String NombreCientifico;
	@Column(name="Nombre_común")
	private String NombreComun;
	@Column(name="Descripcion")
	private String Descripcion;
	@Column(name="Tipo")
	private String tipo;
	public Plaga() {
		super();
	}
	public String getNombreCientifico() {
		return NombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		NombreCientifico = nombreCientifico;
	}
	public String getNombreComun() {
		return NombreComun;
	}
	public void setNombreComun(String nombreComun) {
		NombreComun = nombreComun;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getIdplaga() {
		return idplaga;
	}
	public void setIdplaga(Long idplaga) {
		this.idplaga = idplaga;
	}
	

}
