
package abstruction;

/**
 *
 * @author ComputerArtt
 */
public class Abstruction {

    public static void main(String[] args) {
//        A a1 = new A();no abstract class called
        B b = new B();
        b.Amethod();
        b.Nmethod();
    }  
}
abstract class A
{
    abstract void Amethod();
    void Nmethod()
    {
        System.out.println("non-abstract method");
    }
}
class B extends A
{   int num = 100;
    void Amethod()
    {
        System.out.println("num: " + num);
    }
}
