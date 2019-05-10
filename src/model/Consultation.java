package model;

public class Consultation {
	private date Date;
	private long CINPatient;
	private String Service;
	private String Remarque = new String();
	
	
	
	public date getDate() {
		return Date;
	}
	public void setDate(date date) {
		Date = date;
	}
	public long getCINPatient() {
		return CINPatient;
	}
	public void setCINPatient(long cINPatient) {
		CINPatient = cINPatient;
	}
	public String getRemarque() {
		return Remarque;
	}
	public void setRemarque(String remarque) {
		Remarque = remarque;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	
	

}
