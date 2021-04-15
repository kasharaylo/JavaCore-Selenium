package practics03;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamFromXml {

    @Parameters({"param1", "param2"})

    @Test
    public void paramTest(int p1, String p2) {
        System.out.println("Data Provider Example: Data (" + p1 + ", " + p2 + ")");
    }
}
