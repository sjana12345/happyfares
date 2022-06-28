package com.happyfares.config;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Webdriverconfig {
	
	public RemoteWebDriver driver;
	int count=0;
	@Test (invocationCount = 1)
	public void Chromeconfig() throws IOException {
		File directory = new File(System.getProperty("user.dir") + "/testcases");
		File[] files = directory.listFiles();
		Reader rs=new Reader();
		rs.testlist(files[count].getName());
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("browserVersion", "103.0.5060.53");
        caps.setCapability("platformName", "Linux");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
        driver.get("https://google.com");
        driver.quit();
        count++;
	}
}
