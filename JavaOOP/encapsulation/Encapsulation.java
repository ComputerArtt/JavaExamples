
package encapsulation;

/**
 *
 * @author ComputerArtt
 */

public class Encapsulation {
    
    public static void main(String[] args) {
        Encapsulation2 enc = new Encapsulation2();
        enc.setCountry("usa");
        enc.setPhoneCode(1);
        
        System.out.println("country: " + enc.getCountry());
        System.out.println("Pnum: " + enc.getPhoneCode());
    }   
}
class Encapsulation2
{
    private String country;
    private int PhoneCode;
    
    public String getCountry()
    {
        return country;
    }
    public int getPhoneCode()
    {
        return PhoneCode;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public void setPhoneCode(int PhoneNumber)
    {
        this.PhoneCode = PhoneNumber;
    }
}
