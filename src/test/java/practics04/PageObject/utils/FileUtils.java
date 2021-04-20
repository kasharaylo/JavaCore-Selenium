package practics04.PageObject.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static String getConfigProperty(String property) {
        try (InputStream input = new FileInputStream("src/test/java/practics04/PageObject/config.properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            return prop.getProperty(property);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        throw new IllegalArgumentException("Please specify correct property to get from config.property.");
    }
}
