package com.ocs.service;
import java.sql.Date;
import java.util.ArrayList;

import com.ocs.bean.DoctorBean;

public interface Reporter {

	ArrayList<DoctorBean> viewAllAvailableDoctors(Date date);
	ArrayList<DoctorBean> intimateAdmin(Date date, String status);
	
}
