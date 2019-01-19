package filetest.tests;

import filetest.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

  protected final ApplicationManager app = new ApplicationManager();

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
