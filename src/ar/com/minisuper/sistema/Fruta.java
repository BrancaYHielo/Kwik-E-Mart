/**
 *
 * @author Isnard Matias 
 */
package ar.com.minisuper.sistema;

public class Fruta extends Producto {
	
	private String unidadVenta;


	public Fruta(String nombre, int precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}
	
	@Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Precio: $" + this.precio + " /// " + "Unidad de venta: " + this.unidadVenta;
    }
			

}
