package Ejercicio10JobScheduler.JobScheduler;

import java.util.List;

public abstract class Strategy {
	
	private String strategy;
	
	
	
	public Strategy(String unEstrategia) {
		this.setStrategy(unEstrategia);
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	protected abstract JobDescription next(List<JobDescription> lista);
	
	

}
