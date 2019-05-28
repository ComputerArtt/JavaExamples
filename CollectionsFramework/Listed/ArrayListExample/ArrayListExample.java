
package arraylistexample;
import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<Book> arr = new ArrayList<Book>();
        Book b1 = new Book(111, "A", "X", "*", 10077);
        Book b2 = new Book(111, "B", "Y", "#", 1040);
        Book b3 = new Book(111, "C", "Z", "$", 1020);
        Book b4 = new Book(111, "D", "ß", "-", 1007);
        Book b5 = new Book(111, "E", "Q", "_", 1040);
        Book b6 = new Book(111, "F", "W", "?", 1600);
        Book b7 = new Book(111, "G", "Z", "=", 9100);
        Book b8 = new Book(111, "H", "V", ")", 1002);
        Book b9 = new Book(111, "I", "O", "(", 1010);
        Book b10 = new Book(111, "J", "P", "/", 1080);
        Book b11 = new Book(111, "K", "R", "&", 1007);
        Book b12 = new Book(111, "L", "S", "%", 1050);
        Book b13 = new Book(111, "M", "T", "+", 1200);
        Book b14 = new Book(111, "N", "U", "!", 1);
        Book b15 = new Book(111, "O", "X", "??", 10);
        
        arr.add(b1);arr.add(b2);arr.add(b3);arr.add(b4);
        arr.add(b5);arr.add(b6);arr.add(b7);arr.add(b8);
        arr.add(b9);arr.add(b10);arr.add(b11);arr.add(b12);
        arr.add(b13);arr.add(b14);arr.add(b15);
        
        for(Book b:arr)
        {
            System.out.println(b.id+"  "+b.name+"  "+b.author+"  "+
                                b.publisher+"  "+b.quatity);
        }
        
        
    }
    
}
class Book
{
    int id;
    String name, author,publisher;
    int quatity;
    
    static int counter = 0;
    
    Book(int id, String name, String author, String publisher,int qu)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quatity = qu;
        
        counter++;
    }
}