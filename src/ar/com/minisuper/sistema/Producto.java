/**
 *
 * @author Isnard Matias 
 */
package ar.com.minisuper.sistema;

public abstract class Producto implements Comparable<Producto> {
	
	protected String nombre;
	protected int precio;
	
	public Producto(String nombre,  int precio) {
		this.nombre  = nombre;
		this.precio = precio; 	
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

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public int compareTo(Producto o) {
		return this.getPrecio()>o.getPrecio()?1:this.getPrecio()<o.getPrecio()?-1:0;
	}

}