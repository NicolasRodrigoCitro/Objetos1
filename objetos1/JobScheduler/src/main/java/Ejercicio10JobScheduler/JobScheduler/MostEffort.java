package Ejercicio10JobScheduler.JobScheduler;

import java.util.List;

public class MostEffort extends Strategy {

	public MostEffort(String Strategy) {
		super(Strategy);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JobDescription next(List<JobDescription> lista) {
		return lista.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
	}

}
