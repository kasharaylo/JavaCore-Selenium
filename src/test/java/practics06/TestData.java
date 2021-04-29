package practics06;

import org.testng.annotations.DataProvider;

public class TestData {
	@DataProvider(name="SearchProvider")
	public Object[][] getSearchData() {
		return new Object[][] { 
			{ "query A", "1 result" },
			{ "query B", "0 results" },
			{ "query C", "5 results" }
		};
	}
}
