package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
	private static int numero;
	private int[] listaNumero = null;
	

	public Lista(int[] listaNumero, int numero) {
		this.listaNumero= listaNumero;
		this.numero= numero;
	}
	
	
	
	

// METODO QUE ACCEDE A UN ELEMENTO DE LA LISTA
	public int[] getListaNumero() {
		return listaNumero;
	}





	public void setListaNumero(int[] listaNumero) {
		this.listaNumero = listaNumero;
	}





	public int AccedeLista (int i) {
		try {
			int a =getListaNumero()[i];
			return a;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.print("Error tipo" + e + "\n");;
		}
		return -1;
	}


}
