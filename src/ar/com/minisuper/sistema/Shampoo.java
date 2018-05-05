/**
 *
 * @author Isnard Matias 
 */
package ar.com.minisuper.sistema;

public class Shampoo extends Producto {
	
	private int unidadVenta;

	public Shampoo( String nombre, int unidadVenta, int precio ) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}
	
	@Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Contenido: " + this.unidadVenta + "ml" + " /// " + "Precio: $" + this.precio;
    }

}
