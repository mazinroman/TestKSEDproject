package filetest.tests;

import filetest.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class Base {

  protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME); //Выбор браузера

  @BeforeMethod
  public void setUp() {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }
}
