package com.valentinRomero.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	private String marca;
	private int memoriaRAM;
	private int numeroSerie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantDisponible, String marca, int memoriaRAM,
			int numeroSerie) {
		super(nombre, precio, cantDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Marca: "+this.marca);
		System.out.println("Memoria RAM: "+this.memoriaRAM+"GB");
		System.out.println("Número de serie: "+this.numeroSerie);
 	}
}
