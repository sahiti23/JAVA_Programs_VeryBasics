package Files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileP {

    public static void main(String args[]){
        File file = new File("data.txt");

        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("sahiti");
            pw.println("age is 20");
            pw.close();
        }
        catch(IOException e){
            System.out.printf("error",e);
        }

    }
}
