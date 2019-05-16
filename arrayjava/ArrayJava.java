
package arrayjava;

import java.util.Arrays;

/**
 *
 * @author ComputerArtt
 */
public class ArrayJava {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,5,9,4,5,6,5,2,3,77};
        for (int i : arr) {
            System.out.println(i);
        }
        //Arrays of Objects
        Student[] arr2 = new Student[5];
        arr2[0] = new Student(11, "max");
        arr2[1] = new Student(12, "john");
        arr2[2] = new Student(13, "steve");
        arr2[3] = new Student(14, "gates");
        arr2[4] = new Student(15, "bill");
        
        for(int i=0; i < arr2.length; i++)
            System.out.println(arr2[i].no+"--"+arr2[i].name);
        
        //Multidimensional Arrays
        int[][] arr3 = new int[][]{ {1,3,5},{8,66,45},{5,6,9} };
        for(int i =0; i < arr3.length; i++)
        {
            for(int j = 0; j < arr3.length; j++)
                System.out.print(arr3[i][j] + "    ");
            System.out.println();
        }
        System.out.println(arr.getClass());
        System.out.println(arr3.getClass().getSuperclass());
        
        //Cloning of arrays
        int[][] clonearr3 = arr3.clone();
        for(int i =0; i < clonearr3.length; i++)
        {
            for(int j = 0; j < clonearr3.length; j++)
                System.out.print(clonearr3[i][j] + "    ");
            System.out.println();
        }
        //static int deepHashCode(Object[] a): This method returns a hash code 
        //based on the “deep contents” of the specified Arrays. 
        System.out.println(Arrays.deepHashCode(arr2));
        //fill(originalArray, fillValue): This method assigns this fillValue 
        //to each index of this Arrays.
        Arrays.fill(arr, 5);
        for (int i : arr) {
            System.out.print(i+" ");
        }System.out.println();
        //hashCode(originalArray): This method returns an integer hashCode of
        //this array instance. 
        System.out.println(arr.hashCode());
        //final arrays
        final int[]arr4 = new int[]{9,8,7,6,5,4};
        for(int i = 0; i < arr4.length; i++)
        {
            arr4[i] = arr4[i]*1000;
            System.out.print(arr4[i]+"  ");
        }
    }
    
}
class Student
{
    int no;
    String name;
    Student(int n, String na)
    {
        this.no = n;
        this.name = na;
    }
}
