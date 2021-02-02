package com.tc.hoichoi.config;

import org.springframework.stereotype.Component;

@Component
public class Response {
	public static final String USERNOTFOUND = "User not found";
	public static final String SUCCESS_LOGIN = "Login Success";
	public static final String FAIL_LOGIN = "Login Fail";
	public static final String CREATED = "Created Successfully!!";
	public static final String FORBIDDEN = "Sorry Request Forbidden!!";
	
	public static final String USER_EXIST_MESSAGE = "User already Exists";	
	public static final String SUCCESS_MESSAGE = "success";
	public static final String MOBILEEXIST_MESSAGE = "Mobile Number already Exists";
	public static final String EMAILEXIST_MESSAGE = "Email already Exists";
	public static final String TOKENNOTFOUND = "Token not found";
	public static final String NOTAUTHORIZED = "You are not authorized";
	public static final String NOTEXIST_MESSAGE = "Not Exists";
}
