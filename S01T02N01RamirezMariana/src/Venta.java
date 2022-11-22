import java.util.ArrayList;

public class Venta {
	protected ArrayList<Producto> productos= new ArrayList<Producto>();
	protected double precioTotal=0;
	
	//CONSTRUCTOR DE LA CLASE
	
	public Venta(ArrayList<Producto> productos) throws VentaVaciaException {
		this.productos = productos;
		try {
			if(productos == null ) {
				throw new VentaVaciaException();
			}
		} catch (VentaVaciaException e) {
			
			System.out.print("Para hacer una venta primero debes añadir productos " );
		}
		precioTotal= CalcularTotal(productos);
	}
	
	

	// METODOS GETTERS Y SETTERS
	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	// METODOS PROPIOS DE LA CLASE
	
	//DETERMINA Calcular el precio total de la venta
		public double CalcularTotal(ArrayList<Producto> productos)  {
			
			
				try {
					if(productos == null ) {
						throw new VentaVaciaException();
					}
						else {
					for(int i=0; i< productos.size(); i++ ) {
						precioTotal= precioTotal + productos.get(i).precio;
					}
					}
				} catch (VentaVaciaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			return precioTotal;
		}
		
		
	
 


		@Override
		public String toString() {
			return "La venta contiene los siguientes productos: \n " + productos + ", \n precio Total = " + precioTotal + "]"+ "\n";
		}
	
		
	
	
}
