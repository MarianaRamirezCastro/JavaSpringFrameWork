package n2ejercicio1;


public class Coche {
	// DEFINICION DE LOS ATRIBUTOS DE LA CLASE
	protected static final String MARCA = "Volvo";
	protected static String modelo;
	protected final double potencia = 20.4;
	
	//CONSTRUCTOR DE LA CLASE
	
	public  Coche( String modelo) {
		// Solo la variable modelo la puedo inicializar en el constructor
		this.modelo = modelo;
		System.out.print("El coche es de la marca " + MARCA +", modelo "+ 
					modelo + " y tiene una potencia " + potencia + " kWh." + "\n");
	}
	
	// METODOS GETTERS Y SETTERS
	
	public String getModelo() {
		return modelo;
	}
		
	public double getPotencia() {
		return potencia;
	}
	
	public void setModelo(String modelo) {
		Coche.modelo= modelo;
	}
	
	
	// METODOS PROPIOS DE LA CLASE
	
	//Metodo estatico frenar
			
	static void frenar(Coche coche) {                    
	    System.out.println("El vehiculo esta frenando");
	  }
	
	//Metodo No estatico acelerar
	public void Acelerar() {                    
	    System.out.println("El vehiculo esta acelerando");
	  }
	// METODOS SOBRE ESCRITOS
	public String toString() {
		return ("Coche de la marca" + MARCA + "\n" +
				"modelo" + modelo + " y potencia " + potencia +"\n" );
	}
}
