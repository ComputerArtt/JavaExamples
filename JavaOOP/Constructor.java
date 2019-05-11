
package constructor;

/**
 *
 * @author ComputerArtt
 */
public class Constructor {
    int id;
    String name;
    double points;
    public Constructor() {
        
    }
    public Constructor(int i , String str){
        id = i;
        name = str;
    }
    
    public Constructor(int i, String str, double d){
        id = i;
        name = str;
        points = d;
    }
    
    Constructor(Constructor c){
        id = c.id;
        name = c.name;
        points = c.points;
    }
    public static void main(String[] args) {
        
        Constructor cons = new Constructor();
        System.out.println(cons.id+" " + cons.name);
        
        Constructor cons2 = new Constructor(100, "Steve");
        System.out.println(cons2.id + " " + cons2.name);
        
        Constructor cons3 = new Constructor(200 , "Jobs" , 99);
        System.out.println(cons3.id + " " + cons3.name + " " + cons3.points);
        
        //Java Copy Constructor By constructor
        Constructor cons4 = new Constructor(cons3);
        System.out.println(cons4.id + "-" + cons4.name + "-" + cons4.points);
        
        //Java Copy By assigning the values of one object into another
        Constructor cons5 = new Constructor();
        cons5.id = cons4.id;
        cons5.name = cons4.name;
        cons5.points = cons4.points;
        System.out.println(cons5.id + "---" + cons5.name + "---" + cons5.points);
    }
    
}
