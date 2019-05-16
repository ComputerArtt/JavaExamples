
package numberclass;

import java.math.BigInteger;

public class NumberClass {

    public static void main(String[] args) {
        Integer x = 10;
        System.out.println(x.byteValue());
        System.out.println(x.doubleValue());
        System.out.println(x.longValue());
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(10));
        System.out.println(x.compareTo(11));
        System.out.println(x.equals(5));
        System.out.println(x.equals(10));
        System.out.println(Double.valueOf("100"));
        System.out.println(Integer.valueOf("10", 5));
        System.out.println(x.toString());
        System.out.println(Double.parseDouble("55"));
        System.out.println(Math.abs(-888));
        System.out.println(Math.ceil(-90));
        System.out.println(Math.floor(12.999));
        System.out.println(Math.rint(11.599));
        System.out.println(Math.round(55.555));
        System.out.println(Math.min(11.11, 11.12));
        System.out.println(Math.max(11.11, 11.12));
        System.out.println(Math.E);
        System.out.println(Math.exp(10.0));
        System.out.println(Math.log(1));
        System.out.println(Math.pow(10, 5));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.sin(90));
        System.out.println(Math.cos(90));
        System.out.println(Math.tan(Math.toRadians(45.0)));
        System.out.println(Math.toDegrees(30.0));
        System.out.println(Math.random());
        
        //BigInteger class is used for mathematical operation which involves 
        //very big integer calculations that are outside the limit of all 
        //available primitive data types.
        
        BigInteger bi = new BigInteger("1");
        for(int i = 2; i <= 100;i++)
            bi = bi.multiply(BigInteger.valueOf(i));
        System.out.println("bi: " + bi);
    }
    
}
