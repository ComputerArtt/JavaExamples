
package mergesortjava;

/**
 * source:https://www.geeksforgeeks.org/merge-sort/
 * @author ComputerArtt
 */
public class MergeSortJava {
    void MSort(int array[], int l, int r)
    {
        if(l < r)
        {
            int m = (l+r) / 2;
            MSort(array, l, m);
            MSort(array, m+1, r);
            
            MergeJava(array, l, m, r);
        }
    }
    void MergeJava(int array[], int l, int m, int r)
    {
        int SubArr1 = m - l + 1;
        int SubArr2 = r - m;
        
        int LeftArr[] = new int[SubArr1];
        int RightArr[] = new int[SubArr2];
        
        for(int i = 0;i < SubArr1;++i)
            LeftArr[i] = array[l + i];
        for (int j = 0; j < SubArr2; ++j) 
            RightArr[j] = array[m + 1 +j];
        
        int i = 0, j = 0, k = l;
        while(i < SubArr1 && j < SubArr2)
        {
            if(LeftArr[i] <= RightArr[j])
            {
                array[k] = LeftArr[i];
                i++;
            }else{
                array[k] = RightArr[j];
                j++;
            }
            k++;
        }
        while(i < SubArr1)
        {
            array[k] = LeftArr[i];
            i++;
            k++;
        }
        while(j < SubArr2)
        {
            array[k] = RightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        
        int[] array = new int[]{99,36,54,100,47,6,84,101,77,3,40,23,-14,22,1};
        MergeSortJava msj = new MergeSortJava();
        msj.MSort(array, 0, array.length-1);
        
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
    
}
