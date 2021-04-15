package practics03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "getData") // Data provider
    public void instanceDataProvider(int p1, String p2) {
        System.out.println("Data Provider Example: Data (" + p1 + ", " + p2 + ")");
    }

    //For data for testcases (Login and password for example)
    @DataProvider
    public Object[][] getData(){
        return new Object[][] {
                {5, "five"},
                {6, "six"},
                {7, "seven"},
                {8, "eight"},
        };
    }
}
