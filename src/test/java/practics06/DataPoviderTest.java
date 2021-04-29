package practics06;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPoviderTest {
	@DataProvider(name="SearchProvider")
	public Object[][] getSearchData() {
		return new Object[][] { 
			{ "Lorem", "1 result" },
			{ "Ipsum", "0 results" },
			{ "Test", "5 results" }
		};
	}
	
	@Test(dataProvider="SearchProvider")
	public void searchResultsCountTest(String query, String result) {
		System.out.println("Query " + query + " found " + result);
	}
	
	@Test(dataProvider="SearchProvider", dataProviderClass = TestData.class)
	public void searchResults2CountTest(String query, String result) {
		System.out.println("Query " + query + " found " + result);
	}
	
	@DataProvider(name="SearchProvider2")
	public Object[][] getSearchData2(Method m) {
		if(m.getName() == "methodA") return null;
		return new Object[][] { 
			{ "Lorem", "1 result" },
			{ "Ipsum", "0 results" },
			{ "Test", "5 results" }
		};
	}
	
	@DataProvider(name="SearchProvider3")
	public Object[][] getSearchData2(ITestContext context) {
		for (String group : context.getIncludedGroups()) {
			if(group.equals("A")){
				
			}
		}
		return new Object[][] { 
			{ "Lorem", "1 result" },
			{ "Ipsum", "0 results" },
			{ "Test", "5 results" }
		};
	}
}
