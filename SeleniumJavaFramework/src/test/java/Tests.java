import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
	
	ExtentSparkReporter spark;
	ExtentReports extent;

	
	private WebDriver driver = null;
	private StringBuffer verificationErrors = new StringBuffer();
	
	
	@BeforeSuite
	public void setUp() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void setUpTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anton\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");  
		driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	
	
	
	
	
	
	@Test
	public void test1() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test1").pass("All requirements - Ok, Submitted the Form");
		System.out.println("Test1 Successfully Submitted the Form");
	}
	else {
		extent.createTest("The Property Visit Form - Test1").fail("All requirements - Ok, Can't Submit the Form");
		System.out.println("Test1 Can't Submit the Form");
	}
	 
	
    Thread.sleep(3000); 
	}
	
	
	
	@Test
	public void test2() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios1");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 2").fail("First Name contained Number - Violation, Submitted the Form");
		System.out.println("Test2 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test 2").pass("First Name contained Number - Violation, Can't Submit the Form");
		System.out.println("Test2 Can't Submit the Form");
		}
	 
	}
	
	
	
	@Test
	public void test3() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron/");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 3").fail("Last Name contained symbol - Violation, Submitted the Form");
		System.out.println("Test3 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test 3").pass("First Name contained symbol - Violation, Can't Submit the Form");
		System.out.println("Test3 Can't Submit the Form");
		} 
	
	}
	
	
	@Test
	public void test4() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852g");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 4").fail("Telephone Number contained Letter - Violation, Submitted the Form");
		System.out.println("Test4 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test 4").pass("Telephone Number contained Letter - Violation, Can't Submit the Form");
		System.out.println("Test4 Can't Submit the Form");
		}
	 
	}
	
	
	
	
	@Test
	public void test5() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+3069394*70852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 5").fail("Telephone Number contained Unacceptable Symbol - Violation, Submitted the Form");
		System.out.println("Test5 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test 5").pass("Telephone Number contained Unacceptable Symbol - Violation, Can't Submit the Form");
		System.out.println("Test5 Can't Submit the Form");
		}
	 
	}
	
	
	@Test
	public void test6() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron#gmai)l%com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 6").fail("Invalid Email Format - Violation, Submitted the Form");
		System.out.println("Test6 Successfully Submitted the Form");
	}
	else {
		extent.createTest("The Property Visit Form - Test 6").pass("Wrong Email Format - Violation, Can't Submit the Form");
		System.out.println("Test6 Can't Submit the Form");
	}
	 
	}
	
	
	@Test
	public void test7() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test 7").fail("Unchecked Accept Terms - Violation, Submitted the Form");
		System.out.println("Test7 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test 7").pass("Unchecked Accept Terms - Violation, Can't Submit the Form");
		System.out.println("Test7 Can't Submit the Form");
		}
	 
	}
	
	
	
	@Test
	public void test8() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");
    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test8").fail("First Name missing - Violation, Submitted the Form");
		System.out.println("Test8 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test8").pass("First Name missing - Violation, Can't Submit the Form");
		System.out.println("Test8 Can't Submit the Form");
		}
	 	
	}
	
	
	
	@Test
	public void test9() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	     
		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test9").fail("Last Name missing - Violation, Submitted the Form");
		System.out.println("Test9 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test9").pass("Last Name missing - Violation, Can't Submit the Form");
		System.out.println("Test9 Can't Submit the Form");
		}
	 	
	}
	
	
	
	
	
	@Test
	public void test10() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 
	     
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test10").fail("Telephone Number missing - Violation, Submitted the Form");
		System.out.println("Test10 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test10").pass("Telephone Number missing - Violation, Can't Submit the Form");
		System.out.println("Test10 Can't Submit the Form");
		}
	 	
	}	
	
	
	
	@Test
	public void test11() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 

		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	    
		//driver.findElement(By.name("contactEmail")).click();
		//driver.findElement(By.name("contactEmail")).clear();
		driver.findElement(By.name("contactEmail")).sendKeys("antonios.myron@gmail.com");
	    Thread.sleep(1000); 

	    driver.findElement(By.name("messageText")).sendKeys("abcdefg123456789!@#$%^ABCDEFG");
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test11").pass("All requirements - Ok, Submitted the Form");
		System.out.println("Test11 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test11").fail("All requirements - Ok, Can't Submit the Form");
		System.out.println("Test11 Can't Submit the Form");
		}
	 	
	}
	
	
	@Test
	public void test12() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Antonios");
	    Thread.sleep(1000); 

		driver.findElement(By.name("lastName")).sendKeys("Myron");
	    Thread.sleep(1000); 

		driver.findElement(By.name("phoneNumber")).sendKeys("+306939470852");
	    Thread.sleep(1000); 
	        
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test10").pass("All requirements - Ok, Submitted the Form");
		System.out.println("Test12 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test12").fail("All requirements - Ok, Can't Submit the Form");
		System.out.println("Test12 Can't Submit the Form");
		}
	 	
	}	
	
	
	
	@Test
	public void test13() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Konstantinos");
	    Thread.sleep(1000); 

		driver.findElement(By.name("lastName")).sendKeys("Tsitirokis");
	    Thread.sleep(1000); 

		driver.findElement(By.name("phoneNumber")).sendKeys("+30-693-1234-456");
	    Thread.sleep(1000); 

		driver.findElement(By.name("contactEmail")).sendKeys("konstantinos233.tsitirokis32@gmail.com");
	    Thread.sleep(1000); 

	    driver.findElement(By.name("messageText")).sendKeys("ojvnfovbfo872937!#@ofjfp><?}{JGFFRTY[d]e[[eerojf");
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test13").pass("All requirements - Ok, Submitted the Form");
		System.out.println("Test11 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test13").fail("All requirements - Ok, Can't Submit the Form");
		System.out.println("Test13 Can't Submit the Form");
		}
	 	
	}
	
	
	@Test
	public void test14() throws Exception {
		driver.get("http://375.synergatos.gr/en/propertyDetails/13079");

		driver.findElement(By.name("firstName")).sendKeys("Vasilios");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("lastName")).sendKeys("Gousias");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("phoneNumber")).sendKeys("+30-694-7654-321");
	    Thread.sleep(1000); 
	    
		driver.findElement(By.name("contactEmail")).sendKeys("vasilios59.gousias34@yahoo.com");
	    Thread.sleep(1000); 
	    
	    driver.findElement(By.name("messageText")).sendKeys("abcdefg123456789!@#$%^ABCDEFG");
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("//form[@id='visitEnquiry']/div[7]/div/div/div/div/label")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).sendKeys(Keys.RETURN);
		
	
	if (isElementPresent(By.xpath("//body/div[@id='flashedMessageModal']/div[1]/div[1]/div[1]/div[2]/div[1]"))) {
		extent.createTest("The Property Visit Form - Test14").pass("All requirements - Ok, Submitted the Form");
		System.out.println("Test14 Successfully Submitted the Form");
		}
	else {
		extent.createTest("The Property Visit Form - Test14").fail("All requirements - Ok, Can't Submit the Form");
		System.out.println("Test14 Can't Submit the Form");
		}
	 	
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDownBrowser() throws Exception {
		driver.quit();

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
		
	} 

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
