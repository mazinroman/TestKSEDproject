package filetest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Actions extends HelperActions {

  public Actions(WebDriver wd) {
    super(wd); //Обращение к конструктору базового класса "HelperActions"
  }

  // Авторизация (ввод логина и пароля, нажатие кнопки "Войти"
  public void login(String login, String password) throws InterruptedException {
    inputText(By.name(Locator.username_text),login);
    inputText(By.name(Locator.password_text), password);
    enter(By.name(Locator.password_text));

    Assert.assertEquals(wd.getTitle(), "АРМ");
  }

  public void menuCreate() throws InterruptedException {
    click(By.xpath(Locator.newDoc_button));
    click(By.xpath(Locator.poruchenie));

  }

  public void documentCreation() throws InterruptedException {
    // Тип поручения
    inputText(By.xpath(Locator.doc_typeInp), "На рассмотрение");
    enter(By.xpath(Locator.doc_typeInp));
    // Категория документа
    inputText(By.xpath(Locator.category_doc), "Открытый");
    enter(By.xpath(Locator.category_doc));

    // Ответственный исполнитель
    inputText(By.xpath(Locator.otvetstv_ispoln), "Строганов");
    enter(By.xpath(Locator.otvetstv_ispoln));

    // Кнопка "Создать" завершение создания
    click(By.xpath(Locator.btnCreateDoc));
    TimeUnit.SECONDS.sleep(3);
    Assert.assertEquals(wd.getTitle(), "Документ");
  }

}
