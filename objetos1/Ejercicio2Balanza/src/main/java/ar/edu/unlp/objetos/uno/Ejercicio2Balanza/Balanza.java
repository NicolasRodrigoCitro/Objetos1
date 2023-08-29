package ar.edu.unlp.objetos.uno.Ejercicio2Balanza;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.pesoTotal=0;
		this.precioTotal=0;
		this.cantidadDeProductos=0;
	}

	public void agregarProducto(Producto unProducto) {
		this.cantidadDeProductos+=1;
		this.pesoTotal+=unProducto.getPeso();
		this.precioTotal+=unProducto.getPrecio();
	}

	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket(this.getCantidadDeProductos(),this.getPrecioTotal(),this.getPesoTotal());
		return unTicket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	
}
