package es.curso.java.domain;

import javax.validation.constraints.Size;

import com.google.common.base.Objects;

public class OrdenadorCreateForm {
	
	@Size(max = 64)
	private String id;
	
	@Size(max = 64)
	private String marca;
	
	@Size(max = 64)
	private String modelo;
	
	@Size(max = 64)
	private String password1;
	private String password2;
	
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
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("marca", marca)
                .add("modelo", modelo)
                .add("password1", password1)
                .add("password2", password2)
                .toString();
    }

}
