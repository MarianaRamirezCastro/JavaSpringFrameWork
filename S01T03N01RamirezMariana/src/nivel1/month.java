package nivel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class month {
	private String name;
	
	public static void show() {
		ArrayList<String> meses =new ArrayList<String>();
		Collections.addAll(meses, "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre","Octubre", "Noviembre", "Diciembre");
		System.out.print("Aqui vemos los elementos del arrayList meses sin el mes de AGOSTO" + "\n");
		System.out.print(meses + "\n");
		// Aqui agrego el elemento "Agosto" en la posicion 8 (index 7). He utilizado la List Interface porque puedo indexar los elementos
		meses.add(7, "Agosto");
		System.out.print("Aqui imprimimos los elementos de la lista una vez añadido el mes de agosto en orden" + "\n");
		System.out.print(meses+ "\n");
		
		System.out.print("Creamos un HashSet con los meses, no conserva el orden pero si la unicidad de cada elemento" + "\n");
		HashSet<String> meses2 = new HashSet<String>();
		Collections.addAll(meses2, "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre","Octubre", "Noviembre", "Diciembre");
		System.out.print(meses2 + "\n");
		meses2.add("Agosto");
		System.out.print(meses2.size());
		meses2.add("Enero");
		// Valido que el tamaño de la lista es del mismo tamaño y que no se ha duplicado ningun elemento en este caso el mes de enero
		System.out.print(meses2 + "\n");
		System.out.print(meses2.size());
		
		// Convierte la lista en un iterador
	    Iterator<String> it = meses.iterator();

	    // Print the first item
	    System.out.println(it.next());
		
		
		System.out.print("Aqui imprimimos los elementos de la lista con el iterator" + "\n");
		while(it.hasNext()) {
			  System.out.println(it.next());
			}
		
		System.out.print("Aqui imprimimos los elementos de la lista con un for" + "\n");
		for(var item: meses)
			System.out.print(item + "\n");
		
	}

	
	
	
	
}
