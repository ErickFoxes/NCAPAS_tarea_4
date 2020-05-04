package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Producto {
	@Size(min=1, max=12, message = "El campo codigo debe tener una longitud entre 1 y 12 caracteres.")
	String code;
	@Size(min=1, max=100, message = "El campo nombre debe tener una longitud entre 1 y 100 caracteres.")
	String name;
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 caracteres.")
	String marca;
	@Size(min=1, max=500, message = "El campo descripcion debe tener una longitud entre 1 y 500 caracteres.")
	String desc;
	@Digits(integer=20, fraction = 0, message = "No debe tener decimales")
	String exis;
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message = "El campo de Fecha en formato dd/mm/yyyy")
	String fecI;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getExis() {
		return exis;
	}

	public void setExis(String exis) {
		this.exis = exis;
	}
	
	public String getFecI() {
		return fecI;
	}

	public void setFecI(String fecI) {
		this.fecI = fecI;
	}
	
	

}
