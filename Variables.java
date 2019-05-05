
package variables;

/**
 *
 * @author Computer
 */
public class Variables {
    int a = 10, b =100, c =1000;//instance vari
    static int st =123; //static vari
    public Variables() {
        int a = 999;
        String str = "java";
        System.out.println(a);
        System.out.println(str);
    }
    public void printvars(){
        System.out.println(a*5);
        System.out.println(b*5);
        System.out.println(c*5);
        System.out.println(st);
//        System.out.println(str);//str is local vari.not called 
    }
    public void TypeCasting(){
        float f = a;
        double d = b;
//        byte by = c;
        int a = 13;
        byte by = (byte)a;
        System.out.println("-----------------");
        System.out.println(f);
        System.out.println(d);
        System.out.println(by);
    }
    
    
    public static void main(String[] args) {
        
        Variables var = new Variables();
        var.printvars();
        var.TypeCasting();
    }
    
}
