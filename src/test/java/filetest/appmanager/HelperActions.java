package filetest.appmanager;

import filetest.datatest.Locator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HelperActions {
  protected WebDriver wd;
  protected JavascriptExecutor js;
  protected Actions action;

  public HelperActions(WebDriver wd) {
    this.wd = wd;
    this.js = (JavascriptExecutor) wd;
    action = new Actions(this.wd);
  }

  protected WebElement element(By locator) {
    WebElement element = wd.findElement(locator);
    return element;
  }

  protected WebDriverWait wait(int seconds) {
    WebDriverWait wait = new WebDriverWait(wd, seconds);
    return wait;
  }
  //WebDriverWait wait = new WebDriverWait(wd, 10);
//**************************************************************************
  // Клик по элементу
  protected void click(By locator) throws InterruptedException {
   /* if (isElementPresent(locator) &&  ! wd.findElement(locator).isDisplayed()){
      return;
    }*/
    wait_to_be_clickable(locator);
    wait_until_not_visible(locator);
    action.moveToElement(element(locator)).pause(5).click().perform();
  }

  // Явное ожидание кликабельности элемента
  protected void wait_to_be_clickable(By locator) {
    wait(5).until(ExpectedConditions.elementToBeClickable(locator));
  }

  // Явное ожидание видимости элемента
  protected void wait_until_not_visible(By locator) {
    wait(5).until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  // Явное ожидание завершения колеса загрузки (исключительно в рамках проекта КСЭД)
  protected void wait_loading_wheel() {
    wait(5).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Locator.loading_wheel)));
  }

  // Скрол до элемента
  protected void scroll_to_element(By locator){
    //js.executeScript("arguments[0].scrollIntoView(true);", element(locator));
    action.moveToElement(element(locator)).perform();
  }

  // Ввод значения
  protected void sendKeys(By locator, String keys) throws InterruptedException {
    wait_to_be_clickable(locator);
    action.moveToElement(element(locator)).sendKeys(element(locator), keys).perform();
  }

  // Проверка, что элемент присутствует на странице
  protected boolean isElementPresent(By locator) {
    try {
      element(locator);
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

  // Ожидание загрузки страницы
  protected void wait_page_loaded(By locator) throws InterruptedException {
    if (locator != null){
      wait(5).until(ExpectedConditions.stalenessOf(element(locator)));
    }
    TimeUnit.SECONDS.sleep(2);
    try
    {

      //Initially bellow given if condition will check ready state of page.
	     /* if (js.executeScript("return document.readyState").toString().equals("complete"))
	      {
	         System.out.println("Page Is loaded.");
	       return;
	      } */

      //Этот цикл будет проходить 25 раз, и проверять через каждую 1 секунду, готова ли страница.
      //Чтобы увеличить или уменьшить время ожидания, неоюходимо изменить значение переменной "i".
      for (int i=0; i<15; i++)
      {
        Thread.sleep(1000);
        //System.out.println("Page Ready values="+i);
        if (js.executeScript("return document.readyState").toString().equals("complete"))
        {
          //System.out.println("Page Ready values with Condition="+i);
          break;
        }
      }
    }
    catch (InterruptedException e) {

      //System.out.println("Page Is loaded");
    }
    //To check page ready state.

  }
}
