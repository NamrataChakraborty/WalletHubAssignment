/**
 * 
 */
package assignment2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

/**
 * @author namra
 *
 */
public class StepDefinition {

	private WebDriver driver = null;

	@After
	public void closeBrowser() {
		driver.quit();
	}

	@Given("^User opens the browser$")
	public void User_opens_the_browser() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@When("^User navigates to the URL for Wallet Hub$")
	public void User_navigates_to_the_URL_for_Wallet_Hub() {
		try {
			driver.get("http://wallethub.com/profile/test_insurance_company/");
			Thread.sleep(5000);
			WebElement websiteHeader = driver.findElement(By.xpath("//*[@id='scroller']/main/div[1]/div[2]/div[2]/h1"));
			Assert.assertTrue("Validate website header", websiteHeader.getText().equals("Test Insurance Company"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User should be able to hover and click on the fifth rating star$")
	public void User_should_be_able_to_hover_and_click_on_the_fifth_rating_star() {
		try {
			Actions action = new Actions(driver);

			// Scroll the rating stars into view
			WebElement ratingStars = driver
					.findElement(By.xpath("//*[@id='reviews-section']/div[1]/div[3]/review-star/div"));
			action.moveToElement(ratingStars);
			action.perform();

			List<WebElement> svgObjList = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']"));
			action.click(svgObjList.get(11)).build().perform();

			Thread.sleep(5000);

			// Verify the page for writing the review
			WebElement reviewHeader = driver
					.findElement(By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/h4"));
			Assert.assertTrue("Validate the header of the review page",
					reviewHeader.getText().equals("Test Insurance Company"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^User should be abe to select the insurance type \"([^\"]*)\" and write a review \"([^\"]*)\" for the company$")
	public void User_should_be_abe_to_write_a_review_for_the_company(String insuranceType, String review) {
		WebElement insuranceDropdown = driver.findElement(By.xpath("//div[@class='dropdown second']"));
		insuranceDropdown.click();

		List<WebElement> dropdownData = insuranceDropdown.findElements(By.xpath("ul/li"));
		for (WebElement element : dropdownData) {
			if (element.getText().equals(insuranceType)) {
				element.click();
				break;
			}
		}

		WebElement reviewTextarea = driver.findElement(
				By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/div[1]/textarea"));
		reviewTextarea.sendKeys(review);
	}

	@Then("^User should be able to click on the Submit button$")
	public void User_should_be_able_to_click_on_the_Submit_button() {
		try {
			WebElement submitBtn = driver.findElement(
					By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/sub-navigation/div/div[2]"));
			submitBtn.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User is on the login page$")
	public void User_is_on_the_login_page() {
		WebElement loginPageHeader = driver.findElement(By.xpath("//*[@id='join-light']/div[1]/h2"));
		Assert.assertTrue("Validate login page header",
				loginPageHeader.getText().equals("Login or sign up so we can post your review."));
	}

	@Then("^User should be able to provide the username \"([^\"]*)\" and password \"([^\"]*)\" to login$")
	public void User_should_be_able_to_provide_the_username_and_password_to_login(String username, String password) {
		try {
			WebElement loginLink = driver.findElement(By.xpath("//*[@id='join-light']/form/div/nav/ul/li[2]/a"));
			loginLink.click();

			WebElement usernameField = driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[1]/input"));
			usernameField.sendKeys(username);

			WebElement passwordField = driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[2]/input"));
			passwordField.sendKeys(password);

			WebElement loginButton = driver
					.findElement(By.xpath("//*[@id='join-light']/form/div/div[3]/button/span/span"));
			loginButton.click();

			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^User should be able to verify the review \"([^\"]*)\" is posted$")
	public void User_should_be_able_to_verify_the_review_is_posted(String review) {
		WebElement reviewElement = driver.findElement(By.xpath("//*[@id='reviews-section']/section/article[1]"));
		Assert.assertTrue("Validate review", reviewElement.getText().contains(review));
	}

}
