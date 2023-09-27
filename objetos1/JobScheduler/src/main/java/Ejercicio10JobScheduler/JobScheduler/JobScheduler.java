package Ejercicio10JobScheduler.JobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy actualStrategy;


    public JobScheduler () {
        this.jobs = new ArrayList<>();
        Fifo fifo = new Fifo("FIFO");
        this.setActualStrategy(fifo);
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getActualStrategy() {
        return this.actualStrategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setActualStrategy(Strategy aStrategy) {
        this.actualStrategy = aStrategy;
    }
    public JobDescription next() {
    	JobDescription nextJob = null;
    	if(!this.jobs.isEmpty()) {
    		nextJob =this.getActualStrategy().next(jobs);
    		this.unschedule(nextJob);
    	}
    	return nextJob;
    }
/*
    public JobDescription next() {
        JobDescription nextJob = null;

        switch (strategy) {
            case "FIFO":
                nextJob = jobs.get(0);
                this.unschedule(nextJob);
                return nextJob;

            case "LIFO":
                nextJob = jobs.get(jobs.size()-1);
                this.unschedule(nextJob);
                return nextJob;

            case "HighestPriority":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;

            case "MostEffort":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;
        }
        return null;
    }
*/
}
