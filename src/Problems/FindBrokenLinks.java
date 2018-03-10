package Problems;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.Repository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenLinks {

	// First find all the links with valid Href
	public static List findAllLilnks(WebDriver driver) {

		List<WebElement> al = new ArrayList();
		al = driver.findElements(By.tagName("a"));
		al.addAll(driver.findElements(By.tagName("img")));

		List<WebElement> flist = new ArrayList<>();

		for (WebElement element : al) {
			if (element.getAttribute("href") != null) {
				flist.add(element);
			}
		}

		return flist;
	}

	public static String findBrokenLinks(URL url) throws IOException {

		String response = "";
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try {
			connection.connect();
			response = connection.getResponseMessage();
			connection.disconnect();
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}

	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/geckodriver_latest");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uat.power2sme.com");
		List<WebElement> listAllImages = findAllLilnks(driver);
		
		System.out.println("Total Links to test:  " + listAllImages.size());
		
		for (WebElement element:listAllImages) {
			try {
				
			System.out.println("URL: " + element.getAttribute("href") + "returned:  " + findBrokenLinks(new URL(element.getAttribute("href"))));
		}
		
		catch(Exception e){
			System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured : " + e.getMessage());
		}
		}
		
		driver.quit();
	}

}
