package practics14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterStreamOutput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/practics14/input.txt");
            out = new FileOutputStream("src/practics14/output.txt");
            int i = 0;
            //while loop
            while ((i = in.read()) != -1){
                out.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
