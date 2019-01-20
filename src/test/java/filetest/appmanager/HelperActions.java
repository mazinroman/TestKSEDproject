package filetest.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
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
    scroll_to_element(locator);
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


    TimeUnit.SECONDS.sleep(3);

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
    if (text != null) {
      String existingText = wd.findElement(locator).getAttribute("value");
      if (!text.equals(existingText)) {
        wait_to_be_clickable(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);

/*        if (!text.equals(existingText)) {
          wd.findElement(locator).clear();
          wd.findElement(locator).sendKeys(text);
          TimeUnit.MILLISECONDS.sleep(5);
        }*/
      }
    }
  }

  protected void sendKeys(By locator, String keys) throws InterruptedException {
    wait_to_be_clickable(locator);
    wait_until_not_visible(locator);
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(keys);
    TimeUnit.MILLISECONDS.sleep(4);
  }

  // Нажатие кнопки RETURN в поле ввода, чтобы введенное значение зафиксировалось
  protected void enter(By locator) throws InterruptedException {
    //TimeUnit.SECONDS.sleep(1);
    wd.findElement(locator).sendKeys(Keys.ENTER);
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

  // Получение текста элементов из списка
  public List<String> getTextElements(By locator){
    List<String> listElement = new ArrayList<>();
    List<WebElement> elements = wd.findElements(locator);
    for(WebElement element : elements){
      String text = element.getText();
      listElement.add(text);
    }
    return listElement;
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
