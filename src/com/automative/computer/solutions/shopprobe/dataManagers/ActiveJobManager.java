package com.automative.computer.solutions.shopprobe.dataManagers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.automative.computer.solutions.shopprobe.model.Job;

public class ActiveJobManager {
	private ArrayList<Job> activeJobList;
	private static ActiveJobManager instance;

	protected ActiveJobManager() {

	}

	public static ActiveJobManager getInstance() {
		if (instance == null) {
			instance = new ActiveJobManager();
		}
		return instance;
	}

	public void generateActiveJobs() {
		// TODO Read Database here to get active jobs

		// END TODO

		activeJobList = new ArrayList<>();
		// TODO Dummy for loop that generates jobs based on dummy data.
		for (int i = 0; i < 5; i++) {
			activeJobList.add(new Job(i, "Tim " + i, "Car " + i, i, i, i, i, i, "Status " + i, "Rental " + i, "VIN "
					+ i));
		}
	}

	public ArrayList<Job> getActiveJobList() {
		return activeJobList;
	}

}
