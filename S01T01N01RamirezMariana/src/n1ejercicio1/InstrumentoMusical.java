package n1ejercicio1;

public class InstrumentoMusical {
	// DEFINICION DE LOS ATRIBUTOS DE LA CLASE
	
		
			protected String tipo;
			protected String nombre;
			protected float precio;
			
			
		//CONSTRUCTOR DE LA CLASE
			
				public InstrumentoMusical(String tipo, String nombre, float precio) {
					this.tipo =tipo;
					this.nombre =nombre;
					this.precio = precio;
				}
				
			
				// METODOS GETTERS Y SETTERS
				public String getTipo() {
					return tipo;
				}
				
				public String getNombre() {
					return nombre;
				}
					
				public float getPrecio() {
					return precio;
				}
				
				public void setTipo(String tipo) {
					this.tipo= tipo;
				}
				
				public void setNombre(String nombre) {
					this.nombre= nombre;
				}
				
				public void setPrecio(float precio) {
					this.precio =precio;
				}
				
				// METODOS PROPIOS DE LA CLASE
				
				//DETERMINA QUE INSTRUMENTO ESTA SONANDO
						
				public void toca() {                    
				    System.out.println("Esta sonando");
				  }
				
				
				// METODOS SOBRE ESCRITOS
				public String toString() {
					return ("Tipo: "+ tipo +  " Nombre: " + nombre + 
							" precio: " + precio + "\n" );
				}
}
