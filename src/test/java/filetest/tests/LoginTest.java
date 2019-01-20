package filetest.tests;

import org.testng.annotations.Test;

public class LoginTest extends Base{

  @Test(enabled = false)
  // Тест авторизации
  public void testLogin() throws InterruptedException {
    app.getLoginLogout().login("StroganovSN", "12345");

  }

}
