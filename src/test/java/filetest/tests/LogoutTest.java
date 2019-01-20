package filetest.tests;

import org.testng.annotations.Test;

public class LogoutTest extends Base{

  @Test(enabled = false)
  // Тест выхода из системы
  public void testLogout() throws InterruptedException {
    app.getLoginLogout().login("StroganovSN", "12345");
    app.getLoginLogout().logout();
  }

}
