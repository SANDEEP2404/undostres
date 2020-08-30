package undostres;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Recharge {

	WebDriver driver;

	@Test
	public void recharge() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://prueba.undostres.com.mx/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/input[1]"))
				.click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"))
				.click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/input[1]"))
				.sendKeys("5523261151");
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/input[1]"))
				.click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li[1]"))
				.click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"))
				.click();

		String ExpectedPaymentscreen = "Paga de Forma Segura por Tu Recarga";
		if (ExpectedPaymentscreen != null) {
			WebElement ActualPaymentscreen = driver.findElement(By.xpath(
					"/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[2]/center[1]/table[1]/tbody[1]/tr[1]/td[2]/h2[1]"));
			Assert.assertEquals(ActualPaymentscreen.getText(), ExpectedPaymentscreen);
			System.out.println("Successfully Reached to Payment screen");

		}else
		{
			System.out.println("Not Reached to Payment screen");
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test");;
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("11");
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2025");
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("111");
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("automationexcersise@test.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("123456");
		WebElement frme=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(frme);
		Thread.sleep(3000);
		WebElement box=driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
		box.click();
	
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/form[1]/button[1]")).click();

		//Verify if user get a success message  and recharge get successful.

		String ExpectedSuccessfulMessage="Recarga Saldo de Telcel al número 5523261151";
		if (ExpectedSuccessfulMessage != null) {
			WebElement ActualSuccessfulMessage = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]"));
			Assert.assertEquals(ActualSuccessfulMessage.getText(), ExpectedSuccessfulMessage);
		System.out.println("Recharge Successfully Completed");

		}
	}
}
