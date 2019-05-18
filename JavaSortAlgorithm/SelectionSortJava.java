
package selectionsortjava;

/**
 *
 * @author ComputerArtt
 */
public class SelectionSortJava {

    public static void main(String[] args) {
        
        int[] array = new int[]{55,40,33,52,61,2,8,-11,9};
        int key, temp;
        for(int i = 0; i < array.length; i++)
        {
            key = i;
            for(int j = i+1; j < array.length; j++)
            {
                if(array[key] > array[j])
                    key = j;
            }
            temp = array[key];
            array[key] = array[i];
            array[i] = temp;
            
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
            
        }
    }
    
}
