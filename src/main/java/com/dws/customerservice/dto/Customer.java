package com.dws.customerservice.dto;

public class Customer {

	private int id;
	private String nombre;
	private String apellidos;
	private String rfc;
	private String correo;
	private int id_Region;

	public Customer() {
		super();
	}

	public Customer(int id ,String nombre, String apellidos, String rfc, String correo ,int id_Region) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rfc = rfc;
		this.correo = correo;
		this.id_Region = id_Region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getId_Region() {
		return id_Region;
	}

	public void setId_Region(int id_Region) {
		this.id_Region = id_Region;
	}

}
