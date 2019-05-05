
package operators;

/**
 *
 * @author ComputerArtt
 */
public class Operators {

    public static void main(String[] args) {
        int x = 100;
        //java unary oper
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println("x: " + x);
        System.out.println(x++ + ++x);
        System.out.println(x++ * --x);
        int y = 10, z = -10;
        boolean bo1 = false , bo2 = true;
        System.out.println(~y);
        System.out.println(~z);
        System.out.println(!bo1);
        System.out.println(!bo2);
        //java arithmetic
        int a =99;int b  = 5;
        System.out.println( a + b);
        System.out.println(a - b);
        System.out.println(a * y);
        System.out.println(b / a);
        System.out.println(b % a);
        //java shift oper
        System.out.println("----schift oper----");
        System.out.println(5 << 3);//5*2^3
        System.out.println(2 << 2);
        System.out.println(5 >> 3);//5/2^3
        System.out.println(40 >> 3);
        //java logical
        System.out.println(a > b && b < (b+1));
        System.out.println(a > b || b < b);
        System.out.println(a < b || b < b);
        System.out.println(a > b && b++ < b);
        System.out.println(a > b && ++b < b);
        //java ternary oper
        int max = (a > b) ? a : b;
        System.out.println("max: " + max);
        int min = (a < b) ? a : b;
        System.out.println("min: " + min);
        //java assigment oper
        a = a +1;
        a += 1;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        short s1 = 5 , s2 = 6;
//        s1 = s1 + s2;type casting
        s1 = (short)(s1 + s2);
        System.out.println(s1);
        
        
    }
    
}
