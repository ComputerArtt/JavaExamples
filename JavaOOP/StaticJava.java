
package staticjava;

/**
 *
 * @author ComputerArtt
 */
class university{
    int no;
    String name;
    //static makes your program memory efficient
    static String uni = "oxford";

    public university(int i, String str) {
        no = i;
        name = str;
    }
    static void changestatic(){
        uni = "yale";
    }
    void print(){
        System.out.println(no + " " + name+" "+ uni);
    } 
    
    static{
        System.out.println("static block called."
                + "it is executed before the main method");
    }
}
public class StaticJava {

    
    public static void main(String[] args) {
        university u1 = new university(123, "x");
        u1.print();
        university u2 = new university(355, "y");
        u2.print();
        //we can change the college of all objects by the single line of code
        university.uni = "itu";
        u1.print();
        u2.print();
        //--------------------
        university.changestatic();//call static method
        u1.print();
        u2.print();
        //The static method can not use non static data member or call non-static method directly.
        //System.out.println(uni);
    }
    
}
