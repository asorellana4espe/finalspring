package com.orellanagil.backend.models.entities;

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
	@Column(name="nombre_cientfico")
	private String nombreCientifico;
	@Column(name="nombre_común")
	private String nombreComun;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tipo")
	private String tipo;
	public Plaga() {
		super();
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String snombreCientifico) {
		nombreCientifico = snombreCientifico;
	}
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String snombreComun) {
		nombreComun = snombreComun;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String sdescripcion) {
		descripcion = sdescripcion;
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
