
package polymorphism;

/**
 * this code is get by java-tutorial.pdf 
 * @author ComputerArtt
 */
class Employee
{
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number)
    {
        System.out.println("Employee cons.");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck()
    {
        System.out.println(""
                + "mailing check to "
                + ""+this.address+"-"+this.address+"-"+this.number);
    }
    public String getName()
    {
        return name;
    }
    public String getAdress()
    {
        return address;
    }
    public void setAddress(String addres)
    {
        this.address = addres;
    }
    public int getNumber()
    {
        return number;
    }
}
class Salary extends Employee
{
    private double salary;
    public Salary(String name, String address, int number, double salary)
    {
        super(name,address,number);
        setSalary(salary);
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newsalary)
    {
        if(newsalary >= 0)
            salary = newsalary;
    }
    public double computerPay()
    {
        System.out.println("computing salary pay for " + getName());
        return salary /52;
    }
    public void mailCheck()
    {
        System.out.println("salary class");
        System.out.println("mailing check to "+ getName()
        + " with salary " + salary);
    }
    
}
public class Polymorphism {

    public static void main(String[] args) {
        // TODO code application logic here
        Salary s = new Salary("max","UP",3,3600.00);
        s.mailCheck();
        Employee e = new Salary("john", "Bostan", 2, 2400.00);
        e.mailCheck();
              
    }
    
}
