/*
Здесь был метод авторизации, но я его перенес в класс Action и теперь вызов этого метода происходит из Action.
Ссылки на класс Authorization не удалял, далее можно будет просто переименовать этот класс и создать в нем
другие методы.
 */

package filetest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DocumentCreation extends HelperActions{

  public DocumentCreation(WebDriver wd) {
    super(wd);
  }

  /*Создание нового документа (заполнение атрибутов в открытой форме
  создания(открывается в методе menuCreate) и завершение создания нажатием кнопки "Создать".
  ***ПОРУЧЕНИЕ***/
  public void documentCreation() throws InterruptedException {
    // Тип поручения
    sendKeys(By.xpath(Locator.doc_typeInp), "На рассмотрение"+ Keys.ENTER);
    TimeUnit.SECONDS.sleep(2);
    //enter(By.xpath(Locator.doc_typeInp));
    // Категория документа
    sendKeys(By.xpath(Locator.category_doc), "Открытый"+Keys.ENTER);
    //enter(By.xpath(Locator.category_doc));

    // Ответственный исполнитель
    wd.findElement(By.xpath(Locator.otvetstv_ispoln)).sendKeys("Строганов" + Keys.ENTER);
    //sendKeys(By.xpath(Locator.otvetstv_ispoln), "Строганов"+Keys.ENTER);
    //enter(By.xpath(Locator.otvetstv_ispoln));

    // Кнопка "Создать" завершение создания
    scroll_to_element(By.xpath(Locator.btnCreateDoc));
    TimeUnit.SECONDS.sleep(2);
    wd.findElement(By.xpath(Locator.btnCreateDoc)).click();
    //click(By.xpath(Locator.btnCreateDoc));
    //TimeUnit.SECONDS.sleep(3);
    wait_page_loaded();
    Assert.assertEquals(wd.getTitle(), "Документ");
  }
}
