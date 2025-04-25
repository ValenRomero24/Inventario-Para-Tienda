package com.valentinRomero.clases;

public class Televisor extends ProductoElectrodomestico{
	private double tamañoPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantDisponible, double tamañoPantalla, String resolucion) {
		super(nombre, precio, cantDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tamaño de pantalla: " + this.tamañoPantalla);
		System.out.println("Resolucion: " + this.resolucion);
	}
}