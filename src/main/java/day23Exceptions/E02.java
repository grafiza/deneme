package day23Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src\\main\\java\\day23Exceptions\\file.txt");
        try {
            int k=0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
