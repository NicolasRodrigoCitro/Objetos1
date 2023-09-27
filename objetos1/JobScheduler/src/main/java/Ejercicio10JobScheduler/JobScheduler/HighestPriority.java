package Ejercicio10JobScheduler.JobScheduler;

import java.util.List;

public class HighestPriority extends Strategy {

	public HighestPriority(String Strategy) {
		super(Strategy);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JobDescription next(List<JobDescription> lista) {
		return lista.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
		
	}
}
