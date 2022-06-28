package com.happyfares;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.TestNG;

import com.happyfares.config.Webdriverconfig;
import com.happyfares.operations.Testcountlistner;

@SpringBootApplication
public class HappyfaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyfaresApplication.class, args);
		TestNG tng = new TestNG();
		tng.setListenerClasses(Arrays.asList(Testcountlistner.class));
		tng.setTestClasses(new Class[] { Webdriverconfig.class });
		tng.run();
	}

}
