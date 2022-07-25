package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "steps", tags = "@TesteVendaML", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		String url = "https://www.mercadolivre.com.br";
		String navegador = "Chrome";
		boolean headless = false;

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// esse metodo ele executa o teste sem abrir o navegador / para ativar-lo deixar
			// TRUE na variavel headless
			if (headless) {
				options.addArguments("--headless");
				options.addArguments("--disable-gpu");
				options.addArguments("--window-size=1400,800");
			}
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
		}
		
	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
