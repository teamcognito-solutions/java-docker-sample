package com.tc.hoichoi.config;


import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class CodeGenerator {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private String generateRandomAlphaNumericCode(int digits) {
		String randomCode = "";
		StringBuilder builder = new StringBuilder();
		while (digits-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		System.out.println("builder.toString() " + builder.toString());
		randomCode = builder.toString();

		return randomCode;
	}
	
	private String generateSequence() {
		String seq = "BigB";
		System.out.println("Sequence Code : "+seq);
		return String.valueOf(seq);
	}
	
	public String generatePrimaryKey() {
		Calendar calender = Calendar.getInstance();
		Integer year = calender.get(Calendar.YEAR);
		Integer month = calender.get(Calendar.MONTH) + 1;
		Integer day = calender.get(Calendar.DAY_OF_MONTH);
		Integer hour = calender.get(Calendar.HOUR);
		Integer min = calender.get(Calendar.MINUTE);
		Integer sec = calender.get(Calendar.SECOND);
		Integer ms = calender.get(Calendar.MILLISECOND);

		String primaryKey = year.toString() + month.toString() + day.toString() + hour.toString() + min.toString()
				+ sec.toString() + ms.toString() + generateRandomAlphaNumericCode(5) + generateRandomAlphaNumericCode(5)
				+ generateSequence();
		System.out.println("Primary Key : "+primaryKey);
		return primaryKey;
	}
}


