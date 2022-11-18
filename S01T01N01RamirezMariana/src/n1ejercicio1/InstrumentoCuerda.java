package n1ejercicio1;

public class InstrumentoCuerda extends InstrumentoMusical{
	// ATRIBUTO PROPIO DE LA CLASE instrumento de cuerda
		 
		
		// METODOS CONSTRUCTORES
				public InstrumentoCuerda (String nombre, float precio) {
					super("cuerda", nombre, precio);
				}
				
		// METODO PROPIO DE LA CLASE		
				public void toca() {                    
				    System.out.println("Esta sonando un instrumento de " + getTipo() + ".");
				  }
				
	
}
