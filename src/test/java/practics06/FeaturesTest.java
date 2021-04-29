package practics06;

import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Search")
public class FeaturesTest {
	@Feature("Simple Search")
	@Story("Search document by name")
	@Test
	public void searchByNameTest()  { }
	
	@Epic("Search")
	@Feature("Simple Search")
	@Story("Search document by content")
	@Test
	public void searchByContentTest() { }
	
	@Epic("Search")
	@Feature("Advanced Search")
	@Story("Search document by modified date")
	@Test
	public void advancedSearchByDateModifiedTest() { }
	
	@Epic("Search")
	@Feature("Advanced Search")
	@Story("Search document by created date")
	@Test
	public void advancedSearchByDateCreatedTest() { }
}
