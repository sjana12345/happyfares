package com.happyfares.operations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.happyfares.config.Reader;

public class Operation {
	
	public RemoteWebDriver driver;
	int count=0;
	
	@Test (invocationCount = 1)
	public void perform() throws IOException {
		File directory = new File(System.getProperty("user.dir") + "/testcases");
		File[] files = directory.listFiles();
		Reader rs=new Reader();
		rs.testlist(files[count].getName());
		count++;
	}

}
