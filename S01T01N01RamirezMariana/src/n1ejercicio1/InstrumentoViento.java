package n1ejercicio1;

public class InstrumentoViento extends InstrumentoMusical{
	// ATRIBUTO PROPIO DE LA CLASE instrumento de viento
	
		
		// METODOS CONSTRUCTORES
				public InstrumentoViento (String nombre, float precio) {
						super("viento", nombre, precio);
						
		}
		
				
		// METODO PROPIO DE LA CLASE		
				public void toca() {                    
				    System.out.println("Esta sonando un instrumento de " + getTipo() + ".");
				  }
				

}
