
package vectortest;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ComputerArtt
 */
public class VectorTest {

    public static void main(String[] args) {
        
        Vector v = new Vector(30);
        //add elements to the end
        v.add("JS");
        v.add(1);
        v.add("JAVA");
        v.add(1.1);
        v.add("PYTHON");
        v.add("PASKAL");
        v.add("KOTLIN");
        v.add(1658965);
        v.add('O');
        v.add("C++");
        v.add("HTML5-CSS3");
        System.out.println(v);
        //insert spec. element to spec.position
        v.add(5, 5.5);
        System.out.println(v);
        //appends all elements in spec.Collection to end of Vector
        ArrayList arr = new ArrayList();
        arr.add("PHP");
        arr.add(9.99);
        arr.add("SWIFT");
        arr.add("C#");
        v.addAll(arr);
        System.out.println(v);
        v.add(0, arr);
        System.out.println(v);
        Vector v2 = new Vector();
        //s clone of this vector
        v2 = (Vector)v.clone();
        System.out.println(v2);
        //if this value contains,True
        if(v2.contains(arr))
            System.out.println("OK,CONTAINED");
        //return the element in spec. index
        System.out.println(v.get(0));
        System.out.println(v.get(1));
        //return index of the first ocurennce of the spec. element
        System.out.println(v.indexOf("JAVA"));
        //TEST WHETHER THE VECTOR HAS NO COMPONENTS
        String name = (v.isEmpty()) ? "empty" : "not empty";
        System.out.println(name);
        //index of last ocurrence
        System.out.println(v.lastIndexOf(5.5));
        //removes the first occurence of the spec. elements
        v2.remove("PASKAL");
        System.out.println(v2);
        //compares the spec. objects for equality
        if(v.equals(v2)) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
        //first element
        System.out.println(v.firstElement());
        //trims the capasity of this vec. to current size
        System.out.println(v.capacity());//initial capacity
        v.trimToSize();
        System.out.println(v.capacity());//current capacity
        //Vector convert to String
        System.out.println(v.toString().length());
        //convert to an Array
        System.out.println(v.toArray());
        //sets the size
        v2.setSize(100);
        System.out.println(v2.size());
        //sets the element at spec. index
        v2.setElementAt(arr,3);
        System.out.println(v2);
        //returns last element
        System.out.println(v.lastElement());
        //returns the hash code
        System.out.println(v.hashCode());
        System.out.println(v2.hashCode());
        //remove first occurrence of the argument from this vector
        System.out.println(v2);
        v2.removeElement(arr);
        System.out.println(v2);
        //insert element
        v2.insertElementAt(v, 0);
        System.out.println(v2);
        //remove
        System.out.println(v2);
        v2.remove(0);
        System.out.println(v2);
        v2.clear();
        System.out.println("clear(): " +v2);

        
    }
    
}
