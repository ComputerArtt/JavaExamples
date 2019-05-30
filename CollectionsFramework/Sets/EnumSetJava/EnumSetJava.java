
package enumsetjava;

import java.util.*;
/**
 *
 * @author ComputerArtt
 */
enum enm
{
    JANUAR, FEBRUAR, MARCH, APRIL,MAY,
    JUNI,JULY,AUGUST,SEPTEMBER,OCTOBER,
    NOVEMBER,DECEMBER
};
public class EnumSetJava {

    public static void main(String[] args) {
        
       EnumSet<enm> enumset1,enumset2,
                    enumset3,enumset4;
       
       enumset1 = EnumSet.of(enm.JANUAR);
        System.out.println(enumset1);
        enumset2 = EnumSet.complementOf(enumset1);
        System.out.println(enumset2);
        enumset3 = EnumSet.allOf(enm.class);
        System.out.println(enumset3);
        enumset4 = EnumSet.range(enm.APRIL, enm.NOVEMBER);
        System.out.println(enumset4);
    }
    
}
