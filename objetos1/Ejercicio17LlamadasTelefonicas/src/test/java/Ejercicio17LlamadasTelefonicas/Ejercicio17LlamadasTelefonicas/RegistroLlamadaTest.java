package Ejercicio17LlamadasTelefonicas.Ejercicio17LlamadasTelefonicas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistroLlamadaTest {
	private RegistroLlamada registro;
	private NumeroTelefono numeroLlamada;
	private NumeroTelefono numeroReceptor;
	private Llamada llamada;
	@BeforeEach
	public void setUp() {
		
		this.numeroLlamada = new NumeroTelefono("2215869145");
		this.numeroReceptor = new NumeroTelefono("221467894523");
		
		LocalDateTime fechaHora = LocalDateTime.of(2023, 10, 31, 15, 30);
		this.llamada = new LlamadaLocal(fechaHora,1.0);
		
		this.registro = new RegistroLlamada(this.numeroLlamada,this.numeroReceptor,this.llamada);
		
		
	}
	
	@Test
	public void registrarLlamada() {
		 LocalDateTime fechaHora = LocalDateTime.of(2023, 10, 31, 15, 30);

		this.registro.registrarLlamada(this.llamada);
		assertTrue(this.registro.getLlamada().equals(this.llamada));
		
	}

}
