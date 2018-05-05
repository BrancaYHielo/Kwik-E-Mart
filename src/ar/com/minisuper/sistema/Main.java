/**
 *
 * @author Isnard Matias 
 */
package ar.com.minisuper.sistema;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Bebida colaZero = new Bebida( "Coca-Cola Zero", 1.5, 20 );
		Bebida cola = new Bebida( "Coca-Cola", 1.5, 18 );
		Shampoo shampoo = new Shampoo ( "Shampoo Sedal", 500, 19 );
		Fruta frutilla = new Fruta( "Frutillas ", 64, "kilo" );
		System.out.println(colaZero);
		System.out.println(cola);
		System.out.println(shampoo);
		System.out.println(frutilla);
	    List<Producto> list = Arrays.asList(colaZero, cola, shampoo, frutilla);
	    System.out.println("=============================");
		System.out.println("Producto más caro: " + Collections.max(list).nombre);
	    System.out.println("Producto más barato: " + Collections.min(list).nombre);		
     }
}
