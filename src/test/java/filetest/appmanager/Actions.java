package filetest.appmanager;

import filetest.datatest.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static filetest.datatest.Locator.typeDoc;

public class Actions extends HelperActions {

  public Actions(WebDriver wd) {
    super(wd); //Обращение к конструктору базового класса "HelperActions"
  }


/*  Нажатие на кнопку "Создать" и выбор создаваемого документа
  (наименование документа передается в параметре*/
  public void menuCreate(String doc) throws InterruptedException {
    click(By.xpath(Locator.newDoc_button));
    click(By.xpath(typeDoc(doc)));
    wait_page_loaded();
  }

/*  public void documentCreation() throws InterruptedException {
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
  }*/

}
