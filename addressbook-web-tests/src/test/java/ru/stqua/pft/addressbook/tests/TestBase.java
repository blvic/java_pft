package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqua.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  public ApplicationManager app = new ApplicationManager();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    //gotoGroupPage();
    app.stop();
    //String verificationErrorString = verificationErrors.toString();
    //if (!"".equals(verificationErrorString)) {
    //  fail(verificationErrorString);
    //}
  }


}
