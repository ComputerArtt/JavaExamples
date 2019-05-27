
package bitsettest;

import java.util.BitSet;

/**
 *
 * @author ComputerArtt
 */
public class BitSetTest {

    public static void main(String[] args) {
        BitSet b1 = new BitSet(160);
        BitSet b2 = new BitSet(160);
        
        for(int i =0; i <160; i++)
        {
            if((i%2) == 0)
                b1.set(i);
            if((i%5) != 0)
                b2.set(i);
        }
        System.out.println(b1);
        System.out.println(b2);
        //AND operator
        b2.and(b1);
        System.out.println(b2);
        //OR
        b2.or(b1);
        System.out.println(b2);
        //XOR
        b2.xor(b1);
        System.out.println(b2);
    }
    
}
