package javaloops2;

/**
 *
 * @author ComputerArtt
 */
public class JavaLoops2 {

    
    public static void main(String[] args) {
        String arr[] = {"Hello" , "World", "."};
        
        for(String str : arr){
            System.out.println(str);
        }
        int arr2[] = {1,2,3,5,4,63,25,2,2,222};
        for(int x : arr2){
            if(x == 63)
                System.out.println("oleyyyy");
            if(x == 4)
                continue;
            System.out.println(x);
        }
        int x = 0;
        while(x < 1000){
            System.out.println(x);
            x++;
            if(x == 123)
                break;
        }
        for(int x1 = 1, y = 2; x1 < 10 && y < 100; x1++, y+=10){
            System.out.println(x1 + "  " + y);
        }
    }
    
}
