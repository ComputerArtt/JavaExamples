
package stringclass;

/**
 *
 * @author ComputerArtt
 */
public class StringClass {

    public static void main(String[] args) {
        // There are two ways to create string in Java
        String s1 = "Time is money";
        String s2 = new String("Time is money     ");

        System.out.println(s1.length());
        System.out.println(s2.charAt(5));
        //concat
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s3.substring(3));
        System.out.println(s3.substring(3, 9));
        System.out.println(s2.indexOf("is"));
        System.out.println(s2.indexOf('o'));
        System.out.println(s2.indexOf('O'));
        System.out.println(s1.indexOf("is", 0));
        System.out.println(s2.lastIndexOf("o"));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase("time is Money"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s1));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.trim());
        System.out.println(s3.replace('s', 'm'));
        System.out.println(s1.getBytes());
        System.out.println(s1.hashCode());
        System.out.println(s3.intern());
        System.out.println(s1.matches("Time is money"));
        System.out.println(s1.toCharArray().length);
        System.out.println(s2.toString());
        
        for(String x : s1.split(" "))
            System.out.println(x);
        for(String x : s1.split(" ", 2))
            System.out.println(x);
        
        StringBuffer s = new StringBuffer("Time");
        System.out.println("length: " + s.length());
        System.out.println("capacity: " + s.capacity());
        System.out.println(s.append(" is"));
        System.out.println(s.reverse());
        System.out.println(s.delete(0, 3));
    }
    
}
