
package javaloops;

import java.util.Scanner;

/**
 *
 * @author ComputerArtt
 */
public class JavaLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //aligned to the right Mario Pyramid
        for(int i = 1; i<= N; i++){
            for(int j = i; j < N; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
