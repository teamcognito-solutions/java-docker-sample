package com.tc.hoichoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class VendorAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorAuthApplication.class, args);
	}

}
