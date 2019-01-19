package filetest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelperActions {
  protected ChromeDriver wd;

  public HelperActions(ChromeDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) throws InterruptedException {
    wd.findElement(locator).click();
    TimeUnit.MILLISECONDS.sleep(5);
  }

  protected void inputText(By locator, String text) throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    wd.findElement(locator).sendKeys(text);
  }
  protected void enter(By locator) throws InterruptedException {
    wd.findElement(locator).sendKeys(Keys.RETURN);
    TimeUnit.SECONDS.sleep(1);
    }
}
