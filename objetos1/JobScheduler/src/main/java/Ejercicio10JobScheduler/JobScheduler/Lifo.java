package Ejercicio10JobScheduler.JobScheduler;

import java.util.List;

public class Lifo extends Strategy {

	public Lifo(String Strategy) {
		super(Strategy);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JobDescription next(List<JobDescription> lista) {
		return lista.get(lista.size()-1);
		
	}
}
