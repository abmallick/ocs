package com.ocs.util;

import com.ocs.bean.*;

public interface Authentication {

	boolean authenticate(CredentialsBean user);
	String authorize(String userID);
	boolean changeLoginStatus(CredentialsBean user, int loginStatus);
	
}
