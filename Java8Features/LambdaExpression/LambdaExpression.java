
package lambdaexpression;

import java.util.ArrayList;

/**
 *
 * @author ComputerArtt
 */
@FunctionalInterface
interface Paint
{
    public void paint();
}
interface Say
{
    public String say();
}
interface Say2
{
    public String say(String str);
}
interface Add
{
    int add(int x, int y);
}
interface Draw
{
    public void draw();
}

public class LambdaExpression {

    public static void main(String[] args) {
        int count = 100;
        
        //without lambda expression
        Paint p = new Paint()
        {
          public void paint()
          {
              System.out.println("Paint: "+count);
          }
        };
        p.paint();
        
        //with Lambda Expression
        Paint p2=()->{
            System.out.println("Paint: "+count);
        };
        p2.paint();
        //lambda expression without argument
        Say s=()->{
            return "lambda expression without argument...";
        };
        System.out.println(s.say());
        //Lambda exspression with argument(s)
        Say2 s2=(str)->{
          return "hello "+str;
        };
        System.out.println(s2.say("George"));
        //Lambda exspression with argument(s) but omit function parentheses
        Say2 s3=str->{
            return "hello "+str; 
        };
        System.out.println(s3.say("Thomas"));
        //Lambda exspression with multiple argument(s)
        Add a1=(a,b)->(a+b);
        System.out.println(a1.add(10, 25));
        //Lambda exspression with multiple argument(s) using data type
        //without return keyword
        Add a2 = (int a, int b)->(a+b);
        System.out.println(a2.add(250, 355));
        //Lambda exspression with multiple argument(s) using data type
        //with return keyword
        Add a3 = (int a, int b)->{
            return (a+b);
        };
        System.out.println(a3.add(33, 23));
        //Lambda exspression with Foreach Lopp
        ArrayList<String> l = new ArrayList<String>();
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday ");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        
        l.forEach(
                (n)->System.out.println(n)
        );
        //Lambda expression with multiple statements
        Draw d = ()->{
            
            int rows = 10;
            for (int i = 1; i <= rows; i++) {  
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            }  
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            }
               System.out.println(); 
            } 
            
        };
           d.draw();
    }
}

