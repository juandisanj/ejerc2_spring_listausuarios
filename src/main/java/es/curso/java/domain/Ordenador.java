package es.curso.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Ordenador {
	
	@Id
	@NotNull
	@Size(max=64)
	@Column(name="id", nullable=false, updatable=false)
	private String id;
	
	@NotNull
	@Size(max=64)
	private String marca;
	
	@NotNull
	@Size(max=64)
	private String modelo;
	
	@NotNull
	@Size(max=64)
	@Column(name="clave", nullable=false)
	private String clave;
	
	public Ordenador() {
	}
	
	public Ordenador(String id, String marca, String modelo, String clave) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.clave = clave;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", clave=" + clave + "]";
	}
	
}
