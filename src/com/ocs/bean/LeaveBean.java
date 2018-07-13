package com.ocs.bean;

import java.sql.Date;

public class LeaveBean {

	String reporterID;
	String reporterName;
	String doctorID;
	Date leaveFrom;
	Date leaveTo;
	String reason;
	int status;
	public String getReporterID() {
		return reporterID;
	}
	public void setReporterID(String reporterID) {
		this.reporterID = reporterID;
	}
	public String getReporterName() {
		return reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public Date getLeaveFrom() {
		return leaveFrom;
	}
	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	public Date getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LeaveBean [reporterID=" + reporterID + ", reporterName=" + reporterName + ", doctorID=" + doctorID
				+ ", leaveFrom=" + leaveFrom + ", leaveTo=" + leaveTo + ", reason=" + reason + ", status=" + status
				+ "]";
	}
	
	
	
}
