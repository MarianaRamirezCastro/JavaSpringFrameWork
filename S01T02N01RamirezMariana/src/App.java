import java.util.ArrayList;
import java.lang.Error;

public class App {

	public static void main(String[] args) throws Throwable {
		
		
		// Inicializa productos
		
		Producto producto1 = new Producto("falda", 12.95);
		Producto producto2 = new Producto("pantalon", 19.95);
		Producto producto3 = new Producto("blusa", 15.65);
		Producto producto4 = new Producto("camisa", 10.50);
		
		//System.out.print(producto1 + "\n");
		
		//Inicializa un carrito de compras (no se si esto lo debo crear dentro de mi clase venta).
		
		ArrayList<Producto> carrito = new ArrayList<Producto>();
		 
		carrito.add(producto1);
		carrito.add(producto2);
		carrito.add(producto3);
		
		// Paso por caja y genero una venta con productos.
		
		Venta venta1 = new Venta(carrito);
		
		System.out.print(venta1 +"\n");
		
		//Inicializa un carrito de compras vacío y arroja un error
		Venta venta2 = new Venta(null);
		//System.out.print(venta2 +"\n");
		
	
		try {
			carrito.get(2);
			//LA PROXIMA LINEA SI SE EJECUTA PORQUE NO SE GENERA ERROR
			System.out.print(carrito.get(2) +"\n");
		} catch (IndexOutOfBoundsException e) {
			e.getMessage();
		}
		// SI INTENTAMOS ACCEDE AL PODUCTO NUMERO 4 DE LA LISTA DE COMPRA
		try {
			producto4 = carrito.get(3);
			//LA PROXIMA LINEA NO SE EJECUTA PORQUE GENERA ERROR
			System.out.print(carrito.get(2) +"\n");
			} catch (IndexOutOfBoundsException e) {
				//e.getMessage();
				System.out.print("Estas tratando de acceder a un producto que no esta en la lista"+ e +"\n");
			}

		
// ESTE BLOQUE DE CONDIGO ME PERMITE VALIDAR QUE FUNCIONA ArrayIndexOutOfBoundsException
		try {
			int[] arraySencers = {1, 2, 3};
			int valorPosicio3 = arraySencers[3];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.print("Estas tratando de acceder a un producto que no esta en la lista"+ e +"\n");
		} 
		//Intentem accedir a la posició 3, tot i que només hi ha les posicions 0, 1, 2
		
	
		
	}

	



}
