
package arraylistjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author ComputerArt
 */
public class ArrayListJava {

    public static void main(String[] args) {
        //generic integer arraylist
        int N = 150;
        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        
        for(int i = 0;i <= N; i++)
        {
            arr.add(i);
        }
        //travelling using iterator
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()); 
        }
        System.out.println("Traversing list through List Iterator:");
        ListIterator<Integer> listItr = arr.listIterator(arr.size());
        while(listItr.hasPrevious())
        {
            System.out.println(listItr.previous());
        }
        System.out.println("Traversing list through forEach() method:"); 
        arr.forEach(a->{//lambda expression
            System.out.println(a);
        });
        System.out.println("Traversing list through forEachRemaining() method:");  
        itr = arr.iterator();
        itr.forEachRemaining(ac->
        {
            System.out.println(ac);
        });
        //ArrayList, User-defined class objects
        Student stu1 = new Student(11, "max",99);
        Student stu2 = new Student(11, "john",89);
        Student stu3 = new Student(13, "hans",79);
        
        ArrayList<Student> arrstu = new ArrayList<Student>();
        arrstu.add(stu1);
        arrstu.add(stu2);
        arrstu.add(stu3);
        
        //itterator
        itr = arrstu.iterator();
        while(itr.hasNext())
        {
            Student s = (Student)itr.next();
            System.out.println(s.mark+" "+s.name+" "+s.no);
        }
        //methods of arraylist
        //isEmpty()
        if(arr.isEmpty())
        {
            System.out.println("empty");
        }else
        {
            System.out.println("no empty ...");
        }
        //set()-get()
        System.out.println(arr);
        arr.get(0);
        arr.set(0, 5555);
        System.out.println(arr);
        //sublist
        System.out.println(arr.subList(41, 50));
        //size
        System.out.println(arrstu.size());
        //remove
        System.out.println(arr.indexOf(111));
        System.out.println(arrstu.lastIndexOf(1));
        System.out.println(arr.lastIndexOf(50));
        
        //initialize an ArrayList
        //using add
        ArrayList<String> arr2 = new ArrayList<String>()
        {
            {
                add("I");
                add("You");
                add("He");
                add("She");
            }
        };
        System.out.println(arr2);
        //using asList()
        ArrayList<String> arr3 = new ArrayList<String>(
                Arrays.asList("USA",
                                "UK",
                                "TR",
                                "CANADA")
        );
        System.out.println(arr3);
        //using List.of()
        ArrayList<String> arr4 = new ArrayList<String>(
                List.of("USA",
                         "UK",
                          "TR",
                          "CANADA")
        );
        System.out.println(arr4);
        //using another cpllections
        ArrayList arr5 = new ArrayList(arr);
        System.out.println(arr5);
    }   
}
class Student
{
    int no;
    String name;
    int mark;

    public Student(int no, String name, int mark) 
    {
        this.no = no;
        this.name = name;
        this.mark = mark;
    }
    
    
}
