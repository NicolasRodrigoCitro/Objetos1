package ar.edu.unlp.objetos.uno.Ejercicio2Balanza;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;

	public Balanza() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto unProducto) {
		this.productos.add(unProducto);
	}

	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket(this.getCantidadDeProductos(), this.getPrecioTotal(), this.getPesoTotal(),this.productos);
		this.ponerEnCero();
		return unTicket;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto elemento : this.productos) {
			precioTotal += elemento.getPrecio();
		}
		return precioTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for(Producto elemento : this.productos) {
			pesoTotal+= elemento.getPeso();
		}
		return pesoTotal;
	}

}
