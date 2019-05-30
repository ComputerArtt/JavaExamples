
package linkedlistjava;
import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class LinkedListJava {

    public static void main(String[] args) {
        
        LinkedList<String> li = new LinkedList<String>();
        
        li.add("x");li.add("f");li.add("a");
        li.add("y");li.add("r");li.add("s");
        li.add("z");li.add("p");li.add("b");
        li.add("k");li.add("n");li.add("o");
        li.add("l");li.add("m");li.add("u");
        
        System.out.println(li);
        //methods
        System.out.println(li.size());
        System.out.println(li.contains("x"));
        System.out.println(li.contains("ğ"));
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        
        System.out.println(li.peek());
        System.out.println(li.peekFirst());
        System.out.println(li.poll());
        System.out.println(li);
    }
    
}
