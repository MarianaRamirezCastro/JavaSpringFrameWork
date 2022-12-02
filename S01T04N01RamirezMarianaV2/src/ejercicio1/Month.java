package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Month {
	private String name;
	
	public static ArrayList<String> Month() {
		ArrayList<String> meses =new ArrayList<String>();
		Collections.addAll(meses, "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre");
		return meses;
	}
}
