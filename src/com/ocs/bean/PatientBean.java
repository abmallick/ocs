package com.ocs.bean;

import java.sql.Date;

public class PatientBean {

	String patientID;
	Date appointmentDate;
	String ailmentType;
	String ailmentDetails;
	String diagnosisHistory;
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAilmentType() {
		return ailmentType;
	}
	public void setAilmentType(String ailmentType) {
		this.ailmentType = ailmentType;
	}
	public String getAilmentDetails() {
		return ailmentDetails;
	}
	public void setAilmentDetails(String ailmentDetails) {
		this.ailmentDetails = ailmentDetails;
	}
	public String getDiagnosisHistory() {
		return diagnosisHistory;
	}
	public void setDiagnosisHistory(String diagnosisHistory) {
		this.diagnosisHistory = diagnosisHistory;
	}
	@Override
	public String toString() {
		return "PatientBean [patientID=" + patientID + ", appointmentDate=" + appointmentDate + ", ailmentType="
				+ ailmentType + ", ailmentDetails=" + ailmentDetails + ", diagnosisHistory=" + diagnosisHistory + "]";
	}
	
	
}
