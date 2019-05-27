
package factoriyel;

/**
 * @author ComputerArtt
 */
public class Factoriyel {
    public static int fact(int a)
    {
        int mul = 1;
        for(int i = 1; i <= a; i++)
            mul *=i;
        return mul;
    }
    public static int sum(int a, int b)
    {
        return a + b;
    }
    
}

