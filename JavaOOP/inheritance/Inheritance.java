
package inheritance;

/**
 *
 * @author ComputerArtt
 */
public class Inheritance {

    public static void main(String[] args) {
        animal a = new animal();
        a.sleep();
        birds b = new birds();
        b.age = 3;
        b.name = "blackbirds";
        b.sleep();
        b.speek();
        b.display();
        
        cats c = new cats();
        c.age = 5;
        c.name = "tekir";
        c.sleep();
        c.speek();
        c.display();
        
        subsuper ss = new subsuper();
        ss.display();
        System.out.println(ss instanceof superKeyword);
        
    }
    
}
class animal
{
    int age;
    String name;
    void sleep()
    {
        System.out.println("animals are sleeping");
    }
    
}
class birds extends animal
{
    static int kanat = 2;
    void sleep()
    {
        System.out.println("birds sleeping");
    }
    void speek()
    {
        System.out.println("cik cik cik");
    }
    void display()
    {
        System.out.println(age + "-" + name);
    }
}
class cats extends animal
{
    void speek()
    {
        System.out.println("miyavvvvv");
    }
    void display()
    {
        System.out.println(age + "-" + name);
    }
}