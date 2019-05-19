
package bubblesortjava;

/**
 *
 * @author ComputerArtt
 */
public class BubbleSortJava {

    public static void main(String[] args) {
        int[] arr = new int[]{999,3,5,65,12,-74,54,21,86,95,22,145,33,54,56,28};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j <arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");    
        }
        System.out.println();
    }
    
}
