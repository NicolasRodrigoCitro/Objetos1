package ar.edu.unlp.info.oo1.ej8_distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Consumo;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Distribuidora;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Factura;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Usuario;

public class UsuarioTestVersionPropia {

	
	/*private List<Factura> facturas;
	private List<Consumo> consumos;*/
	private Usuario usuario;
	
	
	
	@BeforeEach
	public void setUp() {
		this.usuario = new Usuario("Delfor","Avenida simpre viva 1234");
		/*Factura factura1 = new Factura(1000,0,Delfor);
		Consumo Alto = new Consumo(LocalDate.of(2021, 6, 8),100,50);//0,894
		Consumo Bajo = new Consumo(LocalDate.of(2023, 9, 24),100,100);//0,707
		this.consumos = new ArrayList<>();
		this.consumos.add(Bajo);
		this.consumos.add(Alto);
		this.facturas = new ArrayList<>();
		this.facturas.add(factura1);*/
	}
	
	@Test
	public void testAgregarConsumo() {
		Consumo Alto2 = new Consumo(LocalDate.of(2023, 9, 25),100,75);//0,8
		this.usuario.agregarMedicion(Alto2);
		assertEquals(Alto2,this.usuario.ultimoConsumo());
		//probar si lo contiene
		// agregar mas consumos
	}
	
	@Test
	public void testFacturarEnBaseA() {
		//chequear tambien por el resto de los atributos el monto, descuento y objeto
		//chequear un usuario sin consumo
		//chequear desde una factura
		Consumo Medio = new Consumo(LocalDate.of(2023, 9, 25),100,75);//0,8
		this.usuario.agregarMedicion(Medio);
		assertEquals(0,this.usuario.facturarEnBaseA(200).getDescuento());
		Consumo Bajo = new Consumo(LocalDate.of(2023, 9, 26),100,100);//0,707
		this.usuario.agregarMedicion(Bajo);
		assertEquals(0,this.usuario.facturarEnBaseA(200).getDescuento());
		Consumo Alto = new Consumo(LocalDate.of(2023, 9, 27),100,50);//0,894
		this.usuario.agregarMedicion(Alto);
		assertEquals(10,this.usuario.facturarEnBaseA(200).getDescuento());
	}
	
}
