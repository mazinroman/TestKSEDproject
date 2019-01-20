package filetest.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HelperActions {
  protected WebDriver wd;
  public JavascriptExecutor js;

  public HelperActions(WebDriver wd) {
    this.wd = wd;
    this.js = (JavascriptExecutor) wd;
  }
  //WebDriverWait wait = new WebDriverWait(wd, 10);

  // Клик по элементу
  protected void click(By locator) throws InterruptedException {
   /* if (isElementPresent(locator) &&  ! wd.findElement(locator).isDisplayed()){
      return;
    }*/
    wait_to_be_clickable(locator);
    wd.findElement(locator).click();
    //wait_loading_wheel();
  }

  // Явное ожидание кликабельности элемента
  protected void wait_to_be_clickable(By locator) {
    WebDriverWait wait = new WebDriverWait(wd, 10);
    wait.until(ExpectedConditions.elementToBeClickable(locator));
  }

  // Явное ожидание видимости элемента
  protected void wait_until_not_visible(By locator) {
    WebDriverWait wait = new WebDriverWait(wd, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  // Явное ожидание завершения колеса загрузки (исключительно в рамках проекта КСЭД)
  protected void wait_loading_wheel() {
    WebDriverWait wait = new WebDriverWait(wd, 10);
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Locator.loading_wheel)));
  }

  // Ожидание загрузки страницы
  protected void wait_page_loaded() throws InterruptedException {


    TimeUnit.SECONDS.sleep(2);

    boolean page_loaded = false;

    while (!page_loaded) {

      page_loaded = js.executeScript("return document.readyState").equals("complete");

      TimeUnit.MILLISECONDS.sleep(1);
    }
  }

  // Скрол до элемента
  protected void scroll_to_element(By locator){

    WebElement element = wd.findElement(locator);
    js.executeScript("arguments[0].scrollIntoView(true);", element);

  }

  // Ввод текста в поле ввода (просто вводится текст, но не нажимается кнопка RETURN/ENTER)
  protected void inputText(By locator, String text) throws InterruptedException {
    //  TimeUnit.SECONDS.sleep(1);
    if (text != null) {
      String existingText = wd.findElement(locator).getAttribute("value");
      if (!text.equals(existingText)) {
        wait_to_be_clickable(locator);
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
  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  // Получение количества элементов (неявные ожидания лучше отключить, иначе будет происходить ожидание)
  protected int getElementCount(By locator){
    return wd.findElements(locator).size();
  }
  // Получение элемента из списка по индексу
  protected WebElement selectAnItemFromTheList(By locator, int index){
    WebElement element = wd.findElements(locator).get(index);
    return element;
  }
}
