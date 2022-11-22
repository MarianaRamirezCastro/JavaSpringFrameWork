
public class Producto {
	// DEFINICION DE LOS ATRIBUTOS DE LA CLASE
	

				protected String nombre;
				protected double precio;
				
				public Producto (String nombre, double precio) {
					this.nombre=nombre;
					this.precio= precio;
	
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


				
				
				// METODOS SOBRE ESCRITOS	
				@Override
				public String toString() {
					return "Artículo [nombre = " + nombre + ", precio = " + precio + "]";
				}
}
