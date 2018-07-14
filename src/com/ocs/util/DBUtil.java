package com.ocs.util;
import java.sql.Connection;

public interface DBUtil {
	 Connection getDBConnection(String driverType);
}