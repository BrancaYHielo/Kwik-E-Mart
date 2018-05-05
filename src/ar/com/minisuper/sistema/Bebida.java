/**
 *
 * @author Isnard Matias 
 */
package ar.com.minisuper.sistema;

public class Bebida extends Producto {
	
	private double unidadVenta;


	public Bebida(String nombre, double unidadVenta, int precio) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}

	@Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Litros: " + this.unidadVenta + " /// " + "Precio: $" + this.precio;
    }

}
