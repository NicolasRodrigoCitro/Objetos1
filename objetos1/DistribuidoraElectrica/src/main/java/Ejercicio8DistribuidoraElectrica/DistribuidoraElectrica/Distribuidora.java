package Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	
	
	public Distribuidora(double precioKWh) {
		this.precioKWh=precioKWh;
		usuarios = new ArrayList<>();
	}
	public void agregarUsuario(Usuario unUsuario) {
		this.usuarios.add(unUsuario);
	}
	// testear factura, la cantida de facturas y que se generen las que correspondan
	// que retornes lista vacia y no null
	public List<Factura> facturar(){
	 return this.usuarios.stream()
			 .map( f -> f.facturarEnBaseA(precioKWh))
			 .collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream()
				.mapToDouble(usuario1 -> usuario1.ultimoConsumoActiva())
				.sum();
			
				
	}
	
	public double getPrecioKW() {
		return this.precioKWh;
	}
	
	public void setPrecioKW(double unPrecioKWh) {
		this.precioKWh=unPrecioKWh;
	}
	
	public List<Usuario> getUsuarios(){
		return new ArrayList<>(this.usuarios);
	}
	
	
	
	
	
	
	
}
