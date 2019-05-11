
package inheritance;

/**
 *
 * @author ComputerArtt
 */
public class superKeyword {
    int height;
    int width = 100;

    superKeyword() 
    {
        System.out.println("super class cons invoked");
    }

    void display()
    {
        System.out.println("super class display method invoked");
    }
}
class subsuper extends superKeyword
{
    subsuper()
    {
        super();
        System.out.println("sub class cons invokeed");
    } 
    
    void display()
    {
        System.out.println("sub class display method invoked");
        //Use of super with variables:
        System.out.println(super.height);
        System.out.println(super.width);
        //Use of super with methods
        super.display();
    }
    
    
    
}