package com.san.empapp.model;

public class Employee {
	private String NAME;
	private String DESIGANTION;
	private Integer ID;
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDESIGANTION() {
		return DESIGANTION;
	}
	public void setDESIGANTION(String dESIGANTION) {
		DESIGANTION = dESIGANTION;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Employee [NAME=" + NAME + ", DESIGANTION=" + DESIGANTION + ", ID=" + ID + "]";
	}
	
	


}
