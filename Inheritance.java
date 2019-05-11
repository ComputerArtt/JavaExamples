
package inheritance;

class MyClass {
    private int a;
    public MyClass (int a) {
        this.a = a;
    }
}
class YourClass extends MyClass {
    private int b;
    public YourClass (int a, int b) {
        
        super(a);
        this.b = b;

    }
}
public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
