
package thisjava;

/**
 *
 * @author ComputerArtt
 */
class book{
    String author;
    float cost;
    int year;

    //    this() can be used to invoke current class constructor.
    book()
    {
        this("Albert Camus", 11.1f,1901);
        System.out.println("default constructor..");
        
    }
    // this can be used to refer current class instance variable.
    book(String author, float cost, int yea)
    {
        this.author = author;
        this.cost = cost;
        //this.year = year;
        year = yea;//no need to use this keyword
    }
    void display()
    {
        System.out.println(author+" "+cost+" "+year);
    }
    //this can be used to invoke current class method 
    void bodisplay()
    {
        System.out.println(author);
    }
    void bo2display()
    {
        this.bodisplay();
        System.out.println(year);
    }   
}
public class ThisJava {

    public static void main(String[] args) {
        book b = new book();
        book b1 = new book("Tolstoy",12.5f,1936);
        b.display();
        b1.display();
        b1.bo2display();
        
        city c1 = new city();
        c1.increase();
        
        A4 a = new A4();
        new A4().getA4().msg();
    }
    
}
//this: to pass as an argument in the method
class city
{
    void population(city obj)
    {
        System.out.println("method invoked");
    }
    void increase()
    {
        population(this);
    }
}
//this: to pass as argument in the constructor call
//We can pass the this keyword in the constructor also. It is useful if we 
//have to use one object in multiple classes
//source:https://www.javatpoint.com/this-keyword
class B
{
    A4 obj;
    B(A4 obj)
    {
        this.obj = obj;
    }
    void display()
    {
        System.out.println(obj.data);
    }
}
class A4
{
    int data = 33;
    A4()
    {
        B b = new B(this);
        b.display();
    }
//    this keyword can be used to return current class instance
    //source:https://www.javatpoint.com/this-keyword
    A4 getA4()
    {
        return this;
    }
    void msg()
    {
        System.out.println("hello");
    }
}
