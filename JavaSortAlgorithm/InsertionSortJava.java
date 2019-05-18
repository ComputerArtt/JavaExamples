
package ınsertionsortjava;

/**
 *
 * @author ComputerArtt
 */
public class InsertionSortJava {

    public static void main(String[] args) {
        int[]array = new int[]{630,89,100,999,45,-7,-65,-100,7,5555,1,87,96};
        int key,j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > key )
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
            
        }
    }
    
}
