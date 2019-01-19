/*
Здесь был метод авторизации, но я его перенес в класс Action и теперь вызов этого метода происходит из Action.
Ссылки на класс Authorization не удалял, далее можно будет просто переименовать этот класс и создать в нем
другие методы.
 */

package filetest.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authorization extends HelperActions{

  public Authorization(ChromeDriver wd) {
    super(wd);
  }

  // Авторизация (ввод логина и пароля, нажатие кнопки "Войти"
  public void login(String login, String password) throws InterruptedException {
    inputText(By.name(Locator.username_text),login);
    inputText(By.name(Locator.password_text), password);
    enter(By.name(Locator.password_text));

    Assert.assertEquals(wd.getTitle(), "АРМ");
  }
}
