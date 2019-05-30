
package stackjava;

import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class StackJava {

    public static void main(String[] args) {
        
        Stack st = new Stack();
        
        System.out.println(st);
        st.push(100);
        System.out.println(st);
        st.push(100);st.push(300);st.push(500);st.push(700);
        st.push(200);st.push(400);st.push(600);st.push(800);
        st.push(1100);st.push(1300);st.push(1500);st.push(1700);
        st.push(1200);st.push(1400);st.push(1600);st.push(1800);
        
        System.out.println(st);
        
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        
        System.out.println(st.search(500));
        System.out.println(st.search(12345));
    }
    
}
