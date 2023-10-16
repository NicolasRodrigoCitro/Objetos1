package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {

	private ReporteDeConstruccion reporte;

	private Pieza piezaOne;
	private Pieza piezaTwo;
	private Pieza piezaThree;
	private Pieza piezaFour;
	private Pieza piezaFive;

	@BeforeEach
	public void setUp() {
		this.reporte = new ReporteDeConstruccion();

		this.piezaOne = new Esfera(2, "Rojo", "Acero");
		this.piezaTwo = new Esfera(2, "Verde", "Aluminio");
		this.piezaThree = new Cilindro(2, 10, "Verde", "Madera");
		this.piezaFour = new Cilindro(2, 10, "Naranja", "Acero");
		this.piezaFive = new PrismaRectangular(4,2,6, "Verde", "Acero");
		
		this.reporte.agregarPieza(piezaOne);
		this.reporte.agregarPieza(piezaTwo);
		this.reporte.agregarPieza(piezaThree);
		this.reporte.agregarPieza(piezaFour);
		this.reporte.agregarPieza(piezaFive);
	}

	@Test
	public void inicializacionTest() {
		ReporteDeConstruccion reporteOne = new ReporteDeConstruccion();
		assertTrue(reporteOne.getPiezas().isEmpty());

	}

	@Test
	public void volumenDeMaterialTest() {
		assertEquals(208,this.reporte.getVolumenDeMaterial("Acero"));
		assertEquals(0,this.reporte.getVolumenDeMaterial("A"));
	}
	
	@Test
	public void superficieDeColorTest() {
		assertEquals(289,this.reporte.getSuperficieDeColor("Verde"));
		assertEquals(0,this.reporte.getSuperficieDeColor("v"));
	}

}
