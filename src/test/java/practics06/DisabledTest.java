package practics06;

import org.testng.annotations.Test;

public class DisabledTest {
	@Test(enabled = false) 
	public void ignoredTest() {
		System.out.println("This test won't be executed");
	}

}
