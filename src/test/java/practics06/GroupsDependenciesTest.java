package practics06;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDependenciesTest {
	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}

	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}

	@Test(groups= "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}

	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(dependsOnGroups = {"database","selenium-test"})
	public void runFinal() {
		System.out.println("runFinal");
	}
}