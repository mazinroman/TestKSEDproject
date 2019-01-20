package filetest.tests;

import org.testng.annotations.Test;

public class Firsttest extends Base{

  @Test
  //@Test(enabled = false) - параметр для того, чтобы тест не запускался
  public void startTest() throws InterruptedException {
    app.getAuthorization().login("StroganovSN", "12345");
    app.getActions().menuCreate();
    app.getActions().documentCreation();

  }

}
