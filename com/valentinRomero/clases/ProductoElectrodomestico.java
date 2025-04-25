package com.valentinRomero.clases;

public class ProductoElectrodomestico {
	private String nombre;
	private double precio;
	private int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantDisponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantDisponible;
	}

	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantDisponible() {
		return cantidadDisponible;
	}

	public void setCantDisponible(int cantDisponible) {
		this.cantidadDisponible = cantDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Precio: "+ this.precio);
		System.out.println("Stock: "+this.cantidadDisponible);
	}
	
}
