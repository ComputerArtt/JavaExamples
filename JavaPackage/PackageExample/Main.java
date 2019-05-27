
package packageexample;
import factoriyel.Factoriyel;
import factoriyel.Animal;
/**
 *
 * @author ComputerArtt
 */
public class Main{
    
    public static void main(String[] args) {
        System.out.println("fact: " + Factoriyel.fact(10));
        System.out.println("sum: " + Factoriyel.sum(100, 123));
       
        factoriyel.Factoriyel f = new Factoriyel();
        factoriyel.Animal a = new Animal();
        a.eat();
    }
    
}
