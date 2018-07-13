package com.ocs.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;

import com.ocs.bean.AppointmentBean;
import com.ocs.bean.DoctorBean;
import com.ocs.bean.PatientBean;

public interface Administrator {

	String addDoctor(DoctorBean doctorBean);
	Boolean modifyDcotor(DoctorBean doctorBean);
	ArrayList<DoctorBean> viewAllDoctors();
	int removeDoctor(String doctorID);
	ArrayList<DoctorBean> suggestDoctors(String patientID, Date date);
	Map<PatientBean, AppointmentBean> viewPatientsByDate(Date appointmetnDate);
	
	
}
