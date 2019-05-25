
package readfilejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.util.Scanner;

/**
 *
 * @author ComputerArtt
 */
public class ReadFileJava {

    public static void main(String[] args) throws Exception {
        // There are multiple ways of writing and reading a text file
        //Here are some of the many ways of reading files
        // BufferedReader: This method reads text from a character-input stream.
        //It does buffering for efficient reading of characters, arrays, and lines.
        File file = new File("test.txt");
        BufferedReader bfrd = new BufferedReader(new FileReader(file));
        
        String str;
        while((str = bfrd.readLine()) != null)
        {
            System.out.println(str);
        }
        //FileReader class: Convenience class for reading character files
        System.out.println("-------------------------------");
        FileReader file2 = new FileReader("test.txt");
        int i;
        while((i = file2.read()) != -1)
        {
            System.out.print((char) i);
        }
        System.out.println("\n-------------------------------");
        //Scanner class: A simple text scanner which can parse primitive types 
          //      and strings using regular expressions.
        File file3 = new File("test.txt");
        Scanner scan = new Scanner(file3);
        while(scan.hasNextLine())
        {
            System.out.println(scan.nextLine());
        }
        System.out.println("\n-------------------------------");
        //Scanner class but without using loops
        File file4 = new File("test.txt");
        Scanner scan2 = new Scanner(file4);
        scan2.useDelimiter("\\Z");
        System.out.println(scan2.next());
        System.out.println("\n-------------------------------");
        //read a text file as String 
        String text = "";
        text =new String(Files.readAllBytes(Paths.get("
                                                test.txt")));
        System.out.println(text);
    }
    
}
