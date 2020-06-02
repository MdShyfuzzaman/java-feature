package main.java.features;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * The type Try with resource example java 9.
 * if we execute the above program using Java 9 compiler,
 * it will execute nicely without any compile error.
 */
public class TryWithResourceExampleJava9 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws FileNotFoundException the file not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileStream=new FileOutputStream("demo_text.txt");
        try(fileStream){
            String txt = "Text written in file";
            byte b[] = txt.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
