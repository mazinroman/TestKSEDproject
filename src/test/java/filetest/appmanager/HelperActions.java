package filetest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HelperActions {
  protected WebDriver wd;

  public HelperActions(WebDriver wd) {
    this.wd = wd;
  }

  // Клик по элементу
  protected void click(By locator) throws InterruptedException {
    if (isElementPresent(locator) &&  ! wd.findElement(locator).isDisplayed()){
      return;
    }
    wd.findElement(locator).click();

  }

  // Ввод текста в поле ввода (просто вводится текст, но не нажимается кнопка RETURN/ENTER)
  protected void inputText(By locator, String text) throws InterruptedException {
    //  TimeUnit.SECONDS.sleep(1);
    if (text != null) {
      String existingText = wd.findElement(locator).getAttribute("value");
      if (!text.equals(existingText)) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }
    }
  }

  // Нажатие кнопки RETURN в поле ввода, чтобы введенное значение зафиксировалось
  protected void enter(By locator) throws InterruptedException {
    wd.findElement(locator).sendKeys(Keys.RETURN);
    TimeUnit.SECONDS.sleep(1);
  }

  // Проверка, что элемент присутствует на странице
  public boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
