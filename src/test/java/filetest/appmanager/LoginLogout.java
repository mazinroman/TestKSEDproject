/*
Здесь был метод авторизации, но я его перенес в класс Action и теперь вызов этого метода происходит из Action.
Ссылки на класс Authorization не удалял, далее можно будет просто переименовать этот класс и создать в нем
другие методы.
 */

package filetest.appmanager;

import filetest.datatest.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginLogout extends HelperActions{

  public LoginLogout(WebDriver wd) {
    super(wd);
  }

  // Авторизация (ввод логина и пароля, нажатие кнопки "Войти"
  public void login(String login, String password) throws InterruptedException {
    inputText(By.name(Locator.username_text),login);
    inputText(By.name(Locator.password_text), password);
    enter(By.name(Locator.password_text));

    wait_page_loaded();
    Assert.assertEquals(wd.getTitle(), "АРМ");
  }

  // Выход из системы (раскрытие меню пользователя, нажатие на действие "Выход")
  public void logout() throws InterruptedException {
    click(By.id(Locator.user_menu));
    click(By.id(Locator.USER_LOGOUT));

    wait_page_loaded();
    Assert.assertEquals(wd.getTitle(), "Войти");
  }
}
