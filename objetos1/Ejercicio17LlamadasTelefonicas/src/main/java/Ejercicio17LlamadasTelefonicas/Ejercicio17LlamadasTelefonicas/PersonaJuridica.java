package Ejercicio17LlamadasTelefonicas.Ejercicio17LlamadasTelefonicas;

public class PersonaJuridica extends Cliente {
	private String cuit;
	private TipoPersonaJuridica tipo;
	public PersonaJuridica(String nombre, String direccion, String dni, String cuit, TipoPersonaJuridica tipo) {
		super(nombre,direccion,dni);
		this.tipo=tipo;
		this.cuit=cuit;
	}

}
