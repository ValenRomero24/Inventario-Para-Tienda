/*Agrega el atributo listaDeProductos para almacenar los productos en el inventario. 
 * Debe de ser un ArrayList<Producto>.

-->*
Implementa métodos para agregar un producto al inventario, mostrar todos los productos disponibles y 
buscar un producto por su nombre.

-->
Implementa un método para realizar una venta, que reduce la cantidad disponible del producto vendido. 
Si la cantidadDisponible del producto ha llegado a cero no reducir la cantidad pero mostrar un mensaje con “Producto agotado”.*/


package com.valentinRomero.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	public static ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	
	public void agregarProducto(ProductoElectrodomestico prod) {
		listaDeProductos.add(prod);
	}
	
	public void mostrarProductosDisponibles() {
		System.out.println("--------------------------------Productos Disponibles--------------------------------");
		for (ProductoElectrodomestico prod : listaDeProductos) {
			if (prod.getCantDisponible() > 0) {
				prod.mostrarInformacion();
				System.out.println("----------------------------------------------------------------");
			}
		}
	}
	
	public ProductoElectrodomestico buscarPorNombre(String nombre) {
		for (ProductoElectrodomestico prod : listaDeProductos) {
			if (prod.getNombre().equals(nombre)) {
				return prod;
			}
		}
		return null;
	}
	
	public void realizarVenta(String nombre) {
		ProductoElectrodomestico aux = this.buscarPorNombre(nombre);
		if (aux != null) {
			if (aux.getCantDisponible()>0) {
				aux.setCantDisponible(aux.getCantDisponible()-1);
			}
			else
				System.out.println("Producto agotado");
		}
		else
			System.out.println("Producto no encontrado");
	}
	
}
