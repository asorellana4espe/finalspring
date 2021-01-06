package com.orellanagil.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="floricolas")
@Entity
public class floricola {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_floricola")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idFloricola;
	@Column(name="nombre")
	private String nombre;
	
	public floricola() {
		
	}
	
	public floricola(Long idFloricola) {
		super();
		this.idFloricola = idFloricola;
	}

	public Long getIdFloricola() {
		return idFloricola;
	}

	public void setIdFloricola(Long idFloricola) {
		this.idFloricola = idFloricola;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
