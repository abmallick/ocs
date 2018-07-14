package com.ocs.util;

import com.ocs.bean.*;

public interface User {

	String login(CredentialsBean credentialsBean);
	boolean logout(String userID);
	String changePassword(CredentialsBean credentialBean, String password);
	String register(ProfileBean profileBean);
}
