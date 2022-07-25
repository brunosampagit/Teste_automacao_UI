package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencia/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy("+n1+","+n2+")");
	}
	
	
	public void enter(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
