package n2ejercicio1;

public class App {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Acelerar acelero = new Acelerar();
		Coche coche1 =new Coche( "EX90");
		System.out.print(coche1.getPotencia()+ "\n");
		Coche.frenar(coche1);
		coche1.Acelerar();
	}

	
}
