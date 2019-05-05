
package creatobject;

/**
 *
 * @author ComputerArtt
 */
class fib{
    
    void fibo(int n){
        int first = 0, second = 1;
        for(int i = 1; i<= n; i++){
            System.out.print(first+" ");
            int sum = first + second;
            first=second;
            second=sum;
        }
        System.out.println(" ");
    }
      
} 
class fib2{

}
public class CreatObject {

    public static void main(String[] args)  {
        //Anonymous obj
        new fib().fibo(40);
        //Creating multiple objects by one type only
        fib f1 = new fib(),f2 = new fib(),f3 = new fib();
        f1.fibo(5);
        f2.fibo(10);
        f3.fibo(15);
    }
    
}
