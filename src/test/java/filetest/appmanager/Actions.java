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
    wait_page_loaded(null);
  }
}
