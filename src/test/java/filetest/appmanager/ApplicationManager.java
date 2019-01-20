package filetest.appmanager;

import filetest.datatest.DataTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;

  private Actions actions;
  private LoginLogout LoginLogout;
  private DocumentCreation DocumentCreation;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
    if (browser.equals(BrowserType.CHROME)){
      wd = new ChromeDriver();
    }else if (browser.equals(BrowserType.FIREFOX)){
      wd = new FirefoxDriver();
    }else if(browser.equals(BrowserType.IE)){
      wd = new InternetExplorerDriver();
    }
    wd.manage().window().maximize();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.get(DataTest.url);

    LoginLogout = new LoginLogout(wd);
    actions = new Actions(wd);
    DocumentCreation = new DocumentCreation(wd);
  }

  public void stop() {
    wd.quit();
  }

  public LoginLogout getLoginLogout() {
    return LoginLogout;
  }

  public Actions getActions() {
    return actions;
  }
  public DocumentCreation getDocCreat() {
    return DocumentCreation;
  }
}
