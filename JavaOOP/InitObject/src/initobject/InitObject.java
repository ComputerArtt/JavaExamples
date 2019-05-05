
package initobject;

/**
 *
 * @author ComputerArtt
 */
class Car{
    int model;
    String renk;
}
class Car2{
    int numWheel;
    String name;
    
    void initClass(int i, String s){
        this.numWheel = i;
        this.name = s;
    }
    void print(){
        System.out.println(numWheel+ " " + name);
    }
}
public class InitObject {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = 1990;
        c1.renk = "red";
        System.out.println(c1.model + " " + c1.renk);
        
        Car2 ca1 = new Car2();
        ca1.initClass(4, "bmw");
        Car2 ca2 = new Car2();
        ca2.initClass(8, "audi");
        ca1.print();
        ca2.print();
    }
    
}
