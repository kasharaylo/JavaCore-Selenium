package practics06;

import org.testng.annotations.Test;

public class ParallelTest {
	@Test(threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
	public void testServer() { }

}
