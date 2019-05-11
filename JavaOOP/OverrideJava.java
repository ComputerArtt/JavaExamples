
package overridejava;

/**
 *
 * @author ComputerArtt
 */
public class OverrideJava {

    public static void main(String[] args) {
        
        Animal a = new Animal();//animal referens and animal obj
        a.move();
        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Animal b = new Dog();//animal referens and dog obj
        b.move();
        b.run();
//        b.sleep();
        b.eat();
        
        Dog d = new Dog();
        d.bark();
        d.sleep();
        
    }
    
}
class Animal
{
    public void move()
    {
        System.out.println("Animals are moving");
    }
    protected void run()
    {
        System.out.println("super class run()");
    }
    // private methods are not overridden
    private void sleep()
    {
        System.out.println("super class sleep()");
    }
//    final methods cannot be overridden
    final void show()
    {
        System.out.println("super class show()");
    }
//    // Static method in parent class which will be hidden in subclass  
    static void eat()
    {
        System.out.println("super class eat()");
    }
}
class Dog extends Animal
{
    public void move()
    {
        System.out.println("Dogs are moving");
    }
    public void bark()
    {
        System.out.println("Dogs are barking");
    }
    public void run()
    {
        System.out.println("sub class run()");
    }
    public void sleep()
    {
        System.out.println("sub class sleep()");
    }
//    void show()
//    {
//        
//    }
    // This method hides eat() in Animal
    static void eat()
    {
        System.out.println("sub class eat()");
    }
}
