package n1ejercicio1;

public class InstrumentoPercusion extends InstrumentoMusical{
	// ATRIBUTO PROPIO DE LA CLASE instrumento de percusión
	
	//Static member variable
	private static String instrumento = "Xilófono";	
	
				// METODOS CONSTRUCTORES
						public InstrumentoPercusion (String nombre, float precio) {
							super("percusión", nombre, precio);
							
						}
						
				// METODO PROPIO DE LA CLASE		
						public void toca() {                    
						    System.out.println("Esta sonando un instrumento de " + getTipo() + ".");
						  }
				//Instance code block		
				// Aqui tengo un bloque que inicializo al llamar a esta clase		
				{
					
				    this.nombre = "pandereta";
				    this.precio = 35;
				    this.tipo = "Percusión";
				    System.out.println("Soy una instacia de la Clase instrumento de Percusion y "
				    		+ "me ejecuto canda vez que se crea una instrumento de percusion.");  
					System.out.println("Esta sonando una pandereta de 35 €" + ".");	
				}
				
				
				static {
					instrumento = "Flauta";
				    System.out.println("Soy una instacia de la Clase instrumento de Percusion y solo me ejecuto una vez.");  
					System.out.println("Soy una flauta perdida");
				}
						
			
}
