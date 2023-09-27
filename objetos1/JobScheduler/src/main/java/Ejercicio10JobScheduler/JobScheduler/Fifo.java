package Ejercicio10JobScheduler.JobScheduler;

import java.util.List;

public class Fifo extends Strategy {

	public Fifo(String Strategy) {
		super(Strategy);

	}

	@Override
	protected JobDescription next(List<JobDescription> lista) {
		return lista.get(0);
		
	}
}
