
package genericsjava;

/**
 *
 * @author ComputerArtt
 */
public class GenericsJava<T> {
    T obj;

    public GenericsJava(T obj) {
        this.obj = obj;
    }
    public T getObj()
    {
        return this.obj;
    }
    //generic method
    public static <E> void printdata(E[] data)
    {
        for (E element :data) {
            System.out.print("-"+element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
    GenericsJava<Integer> iobj = new GenericsJava<>(15236);
    System.out.println(iobj.getObj());
    
    GenericsJava<String> sobj = new GenericsJava<>("deneme");
    System.out.println(sobj.getObj());
    
    //create arrays different types
    Integer[] iArray= {1,6,5,9,4,8,66,54,63,7,54,6,66666,542,1,3,5};
    Double[] dArray = {3.3, 5.5, 65.2, 77.0};
    Character[] cArray = {'c','O','m','P','u','T','e','R','a','R','t','t'};
    
    printdata(iArray);
    printdata(dArray);
    printdata(cArray);
    
    //Generic class object
    Generic_Class <Integer> integer_Generic_Class = new Generic_Class<Integer>();
    Generic_Class <String> string_Generic_Class = new Generic_Class<String>();
    
    integer_Generic_Class.add(Integer.MAX_VALUE);
    string_Generic_Class.add("Hello World...");
    
    System.out.println(integer_Generic_Class.get());
    System.out.println(string_Generic_Class.get());    
    }
    
}
class Generic_Class < T >{
    
    private T t;
    
    public void add(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
    
    
}
