package filetest.tests;

import org.testng.annotations.Test;

public class Firsttest extends Base{

  @Test
  public void startTest() throws InterruptedException {
    app.getActions().login("StroganovSN", "12345");
    app.getActions().menuCreate();
    app.getActions().documentCreation();

  }

}
