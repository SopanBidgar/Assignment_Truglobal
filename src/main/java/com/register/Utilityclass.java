package com.register;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilityclass {

	public void initialiseBrowser(WebDriver driver) {

		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String GetTestData(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\hites\\OneDrive\\Desktop\\Automation Testing\\Parametrization\\TestData.xlsx");

		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();

		return value;
	}

	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\hites\\OneDrive\\Desktop\\Automation Testing\\ScreenshotsCapture\\testcaseID" + TCID
						+ ".png");
		FileHandler.copy(source, destination);
	}

}
