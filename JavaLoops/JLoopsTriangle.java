
package jloopstriangle;

import java.util.Scanner;

/**
 *
 * @author ComputerArtt
 */
public class JLoopsTriangle {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int N = scan.nextInt();
        
        for(int i = 0; i < N; i++){
            for(int j= N-i; j > 1;j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
