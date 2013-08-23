package com.automative.computer.solutions.shopprobe.model;

public class Job {
	private int jobNumber;
	private String custName;
	private String automobileName;
	private int partsCount;
	private int ord;
	private int rec;
	private int ret;
	private int merge;
	private String jobStatus;
	private String rentalAgency;
	private String vinNumber;
	
	
	public Job(int jobNumber, String custName, String automobileName, int partsCount, int ord, int rec, int ret,
			int merge, String jobStatus, String rentalAgency, String vinNumber) {
		this.jobNumber = jobNumber;
		this.custName = custName;
		this.automobileName = automobileName;
		this.partsCount = partsCount;
		this.ord = ord;
		this.rec = rec;
		this.ret = ret;
		this.merge = merge;
		this.jobStatus = jobStatus;
		this.rentalAgency = rentalAgency;
		this.vinNumber = vinNumber;
	}
	
	public int getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAutomobileName() {
		return automobileName;
	}

	public void setAutomobileName(String automobileName) {
		this.automobileName = automobileName;
	}

	public int getPartsCount() {
		return partsCount;
	}

	public void setPartsCount(int partsCount) {
		this.partsCount = partsCount;
	}

	public int getOrd() {
		return ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public int getRec() {
		return rec;
	}

	public void setRec(int rec) {
		this.rec = rec;
	}

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}

	public int getMerge() {
		return merge;
	}

	public void setMerge(int merge) {
		this.merge = merge;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getRentalAgency() {
		return rentalAgency;
	}

	public void setRentalAgency(String rentalAgency) {
		this.rentalAgency = rentalAgency;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	
	
	
}
