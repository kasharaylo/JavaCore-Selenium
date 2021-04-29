package practics06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.*;

import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginTest {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Creating new user");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Deleting previously created user");
  }
  
  @Test
  @Severity(SeverityLevel.CRITICAL)
  public void loginWithValidPasswordTest() {
	  System.out.println("First testcase");
	  Assert.assertEquals(1, 2);
  }
  
  @Test
  public void loginWithOldPasswordTest() {
	  int[] array = null;
	  System.out.println(array[1]);
  }
  
  @Test
  public void loginWithInvalidPasswordTest() {
	  System.out.println("Second testcase");
  }
  
  @Test
  public void failedWithAttachmentTest() throws IOException {
	  Allure.addAttachment("Page source", new String(Files.readAllBytes(Paths.get("src/test/resources/source.txt"))));
	  
	  Path screenshot = Paths.get("src/test/resources/fail.png");
	  Allure.addAttachment("Screenshot", Files.newInputStream(screenshot));
	  
	  Assert.assertEquals(1, 2);
  }
}
