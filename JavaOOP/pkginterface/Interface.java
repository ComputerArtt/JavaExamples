
package pkginterface;

/**
 *
 * @author ComputerArtt
 */
interface A
{
    void name();
   
}
interface B
{
    void age();
}
//An interface can also extend multiple interfaces.
interface C extends A ,B
{
    void education();
}
class example implements C
{

    @Override
    public void education() {
        System.out.println("graduated");
    }

    @Override
    public void name() {
        System.out.println("max");
    }

    @Override
    public void age() {
        System.out.println("33");
    }
    
}
//A class can extends another class and/ can implement one and more 
//than one interface
class example2 extends example implements A , B
{

    @Override
    public void name() {
        System.out.println("jhon");
    }

    @Override
    public void age() {
        System.out.println("11");
    }
    
}
public class Interface {

    public static void main(String[] args) {
        example ex = new example();
        ex.age();
        ex.education();
        ex.name();
        
        example2 ex2 = new example2();
        ex2.age();
        ex2.name();
        ex2.education();
        
    }
    
}
