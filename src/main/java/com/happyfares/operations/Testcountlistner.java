package com.happyfares.operations;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Testcountlistner implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equals("Chromeconfig")) {
			File directory = new File(System.getProperty("user.dir") + "/testcases");
			File[] files = directory.listFiles();
			annotation.setInvocationCount(files.length);
		}
		
	}

}
