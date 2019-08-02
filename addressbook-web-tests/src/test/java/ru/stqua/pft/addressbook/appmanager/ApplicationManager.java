package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqua.pft.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver driver;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();
  private String baseUrl;

  public void init() {
    System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  public void login(String username, String password) {
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  public void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).click();
  }

  public void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  public void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void deleteGroup() {
    driver.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }

  public void returnToGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void stop() {
    driver.quit();
  }
}
