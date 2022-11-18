package n1ejercicio1;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inicializa un instrumento 1 que es un ins musical del tipo viento
		InstrumentoMusical InsMus1 = new InstrumentoViento("Clarinete", 300);
		InsMus1.toca();
		//System.out.print(InsMus1.toString());
		
		
		InstrumentoMusical InsMus2 = new InstrumentoCuerda("Violin", 300);
		InsMus2.toca();
		//System.out.print(InsMus2.toString()); 
		
	
		
		
		InstrumentoMusical InsMus3 = new InstrumentoPercusion("Tambor", 300);
		InstrumentoMusical InsMus4 = new InstrumentoPercusion("triangulo", 112);
		InsMus3.toca();
		
		
		
		
	}

}