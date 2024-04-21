package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Base {

	public static Page page;
	
	@BeforeSuite
	public static void startUp() {
		System.out.println("Before Suite Run");
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		page = context.newPage();
	}
	
	@AfterSuite
	public static void tearDown() {
		System.out.println("       After Suite Run");
	//	 tearDown() can run only one time after all test run that's why we can use @AfterSuite before this method 
		page.close();	
	}

	@BeforeMethod
	public static void scrutinize() {
		System.out.println("    Before Method Run");// confirm that Before method run right after before suite & immediate before test
	
	}
	@AfterMethod
	public static void runAfterTest() {
		System.out.println("    After Method Run");// confirm that Test run 
	
	}
	@BeforeClass
	public static void beforeClass(){
		System.out.println("  Before class Run");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("  After class Run");
	}
	
	
	public static void navigate(String url) {
		page.navigate(url);
	}
	public static void click(String locator) {
		page.locator(locator).click();
	}
	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}
	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}
	public static void p(String s) {
		System.out.println("MMMMMMMMMMMMMMMMMMMM");
	}
	
	public static void assertion(String xpath, String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}
	
	public static void selection(String path, String value) {
		page.selectOption(path, value);
	}
	public static void count_Table_Head(String xpath, String xpath2) {// This is how we can count the table rows
		int num = page.locator(xpath).locator(xpath2).count();
		System.out.println("Table head is : " + num);
	}
	public static void arrowdown(String locator, String Key) {
		for (int i = 0; i < 2; i++) {
			page.press(locator, Key);
		}
	}
	
	public static void arrowright(String locator) {
			for (int i = 0; i < 2; i++) {
				page.press(locator, "ArrowDown");
			}
	}
	public static void browserClose() {
		page.close();
//		browser.close();
//		playwright.close();

		
}
}
