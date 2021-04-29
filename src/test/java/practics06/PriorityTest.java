package practics06;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void testA1() {
		System.out.println("testA1");
	}

	@Test(priority = 2)
	public void testA2() {
		System.out.println("testA2");
	}

	@Test(priority = 3)
	public void testA3() {
		System.out.println("testA3");
	}
	
	@Test(priority = 4)
	public void testA4() {
		System.out.println("testA4 and throw NullPointerException");
		  int[] array = null;
		  System.out.println(array[1]);
	}
	
	@Test(priority = 5)
	public void testA5() {
		System.out.println("testA4 and throw NullPointerException");
		  System.out.println(5/0);
	}
}
