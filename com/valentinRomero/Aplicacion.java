/*Ahora crea un archivo de Aplicacion.java en el paquete com. 
 * Dentro de este archivo deberás de cumplir con los siguientes requisitos:
Instancia objetos de diferentes tipos de productos electrónicos y 
agrégalos al inventario de la tienda.
Realiza algunas ventas y 
verifica que la cantidad disponible de los productos se actualice correctamente.
Muestra todos los productos disponibles en el inventario para verificar 
que se agregaron correctamente.
 * */

package com.valentinRomero;

import com.valentinRomero.clases.*;

public class Aplicacion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor T1 = new Televisor("Sony Bravia 120'", 1999.99, 2, 120, "4K");
		Televisor T2 = new Televisor("Samsung Tv 89'", 1099.99, 1, 89, "4K");
		ComputadoraPortatil C1 = new ComputadoraPortatil("Ideapad Flex 5", 599.99, 5, "Lenovo", 16, 28935423);
		ComputadoraPortatil C2 = new ComputadoraPortatil("Envy x360", 649.99, 2, "HP", 8, 923854623);
		
		TiendaElectronica Tienda = new TiendaElectronica();
		Tienda.agregarProducto(T1);
		Tienda.agregarProducto(C1);
		Tienda.agregarProducto(T2);
		Tienda.agregarProducto(C2);

		Tienda.mostrarProductosDisponibles();
		
		Tienda.realizarVenta("Envy x360");
		Tienda.realizarVenta("Envy x360");
		
		Tienda.realizarVenta("Sony Bravia 120'");
		Tienda.realizarVenta("Samsung Tv 89'");
		
		Tienda.mostrarProductosDisponibles();
		
	}

}
