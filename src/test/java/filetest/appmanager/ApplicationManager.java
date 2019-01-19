package filetest.appmanager;

import filetest.datatest.DataTest;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  ChromeDriver wd;

  private Actions actions;
  private Authorization authorization;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().window().maximize();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get(DataTest.url);
    authorization = new Authorization(wd);
    actions = new Actions(wd);
  }

  public void stop() {
    wd.quit();
  }

  public Authorization getAuthorization() {
    return authorization;
  }

  public Actions getActions() {
    return actions;
  }
}
