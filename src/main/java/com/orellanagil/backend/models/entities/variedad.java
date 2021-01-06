package com.orellanagil.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="variedades")
@Entity
public class variedad {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_variedad")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idVariedad;
	@Column(name="nombre")
	private String nombre;
	@Column(name="num_matas")
	private Calendar numMatas;	
	
	public variedad() {
			
	}
	
	public variedad(Long idVariedad) {
		super();
		this.idVariedad = idVariedad;
	}

	public Long getIdVariedad() {
		return idVariedad;
	}

	public void setIdVariedad(Long idVariedad) {
		this.idVariedad = idVariedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getNumMatas() {
		return numMatas;
	}

	public void setNumMatas(Calendar numMatas) {
		this.numMatas = numMatas;
	}
	
}
