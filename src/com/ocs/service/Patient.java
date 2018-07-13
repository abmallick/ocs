package com.ocs.service;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;

import com.ocs.bean.*;

public interface Patient {

	String addAilmentDetails(PatientBean patientBean);
	boolean modifyAilmentDetails(String patientID);
	ArrayList<PatientBean> viewAilmentDetails(String patientID);
	ArrayList<DoctorBean> viewListOfDoctors(String type, Date date);
	String requestForAppointment(String doctorID, Date appointmentDate);
	Map<AppointmentBean, PatientBean> viewAppointmentDetails(String patientID, Date date);
	
}
