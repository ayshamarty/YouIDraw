package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tests {

	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver);

		WebElement checkElement = driver.findElement(By.id("brush"));
		checkElement.click();
		checkElement = driver.findElement(By.id("imgBrush"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"moreBrush\"]/li[28]/div"));
		checkElement.click();

		action.moveByOffset(750, 500).clickAndHold().moveByOffset(50, -100).release().clickAndHold()
				.moveByOffset(50, 100).release().moveByOffset(-80, -40).clickAndHold().moveByOffset(60, 0).release()
				.perform();
		action.moveByOffset(30, -60).clickAndHold().moveByOffset(40, 50).release().moveByOffset(30, -50).clickAndHold()
				.moveByOffset(-60, 100).release().perform();
		action.moveByOffset(130, -100).clickAndHold().moveByOffset(-60, 0).moveByOffset(0, 45).moveByOffset(60, 0)
				.moveByOffset(0, 55).moveByOffset(-60, 0).release().perform();
		action.moveByOffset(80, -100).clickAndHold().moveByOffset(0, 100).release().moveByOffset(0, -50).clickAndHold()
				.moveByOffset(60, 0).release().moveByOffset(0, -50).clickAndHold().moveByOffset(0, 100).release()
				.perform();
		action.moveByOffset(10, 0).clickAndHold().moveByOffset(50, -100).release().clickAndHold().moveByOffset(50, 100)
				.release().moveByOffset(-80, -40).clickAndHold().moveByOffset(60, 0).release().perform();
		Thread.sleep(10000);

	}
}
