package ejercicio2;

public class CalculoDni {
	private String numero =null;
	 
	 public CalculoDni (String numero) {
		 this.numero=numero;
		 
	 }
	 
	// CREACION GETTERS AND SETTERS
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	// METODO QUE ME SEPARA LOS NUMEROS Y LA LETRA DEL DNI
	
	public Integer numeroDni() {
		String numeroSinLetra="" ;

		for (int i = 7; i > -1; i--) {
			numeroSinLetra = numero.charAt(i) + numeroSinLetra;
		}
		Integer numeroEnteroSinLetra = Integer.valueOf(numeroSinLetra);
		return numeroEnteroSinLetra;
	}
	
	
	// METODO QUE CALCULA LA LETRA DEL DNI
	public static String letraDni(Integer numeroEnteroSinLetra) {
		String letraObtenida = null;
		int letra = numeroEnteroSinLetra % 23;
       switch (letra){
		case 0:
			letraObtenida = "T";
			break;
		case 1:
			letraObtenida = "R";
			break;
		case 2:
			letraObtenida = "W";
			break;
		case 3:
			letraObtenida = "A";
			break;
		case 4:
			letraObtenida = "G";
			break;
		case 5:
			letraObtenida = "M";
			break;
		case 6:
			letraObtenida = "Y";
			break;
		case 7:
			letraObtenida = "F";
			break;
		case 8:
			letraObtenida = "P";
			break;
		case 9:
			letraObtenida = "D";
			break;
		case 10:
			letraObtenida = "X";
			break;
		case 11:
			letraObtenida = "B";
			break;
		case 12:
			letraObtenida = "N";
			break;
		case 13:
			letraObtenida = "J";
			break;
		case 14:
			letraObtenida = "Z";
			break;
		case 15:
			letraObtenida = "S";
			break;
		case 16:
			letraObtenida = "Q";
			break;
		case 17:
			letraObtenida = "V";
			break;
		case 18:
			letraObtenida = "H";
			break;
		case 19:
			letraObtenida = "L";
			break;
		case 20:
			letraObtenida = "C";
			break;
		case 21:
			letraObtenida = "K";
			break;
		case 22:
			letraObtenida = "E";
			break;
		default:
			System.out.print("Aun no he escrito la letra");
			break;
	}
       return letraObtenida;
	}
	
	//METODO QUE VALIDA EL NUMERO DE DNI INTRODUCIDO
	
	public boolean validaDni() {
		char letraChar= numero.charAt(8);
		String letraDada = String.valueOf(letraChar);
		Integer numero =numeroDni();
		String letraObtenida= letraDni(numero);
		return letraDada.equals(letraObtenida);
		
	}
}
