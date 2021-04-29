package practics06;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersTest {
	@Parameters({"username", "password"})
	@Test(description = "description") // @Descrption("This is test description")
	public void ParameterTest(String username, String password) {
		System.out.println("User Name passed as " + username);
		System.out.println("Password passed as " + password);
	}
}
