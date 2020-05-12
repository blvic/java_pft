package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private  String browser;
  WebDriver driver;
  private  NavigationHelper navigationHelper ;
  private  GroupHelper groupHelper ;
  private  SessionHelper sessionHelper ;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();
  private String baseUrl;

  private ContactHelper contactHelper;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver.exe");
    System.setProperty("webdriver.ie.driver","C:\\Tools\\IEDriverServer.exe");
    System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
    if (browser.equals(BrowserType.FIREFOX)) {
      driver = new FirefoxDriver();
    } else if (browser.equals(BrowserType.CHROME)) {
      driver = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)) {
      driver = new InternetExplorerDriver();
    }

   // driver = new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    contactHelper = new ContactHelper(driver);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
     driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
  
  public ContactHelper getContactHelper() {return  contactHelper;}
}
