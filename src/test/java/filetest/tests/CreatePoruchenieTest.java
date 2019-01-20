package filetest.tests;

import org.testng.annotations.Test;

public class CreatePoruchenieTest extends Base{

  @Test
  // Тест создания документа "Поручение"
  public void testCreatePoruchenie() throws InterruptedException {
    app.getLoginLogout().login("StroganovSN", "12345");
    app.getActions().menuCreate("Поручение");
    app.getDocCreat().documentCreation();

  }

}
