package practics06;

import org.testng.annotations.Test;

public class UserTest {
	@Test
	public void createUserTest() {
		System.out.println("Create user");
	}
  
	@Test(dependsOnMethods = { "createUserTest" } )
	public void deleteUser() {
		System.out.println("Delete user");
	}
}
