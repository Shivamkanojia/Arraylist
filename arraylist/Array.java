import java.util.Scanner;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []marks= new int [5];
        int n=5;
        int i;
        System.out.println("enter elements in the array");
        for( i=0;i<n;i++)
        {
           marks[i]=sc.nextInt();
        }
        System.out.println("elements in the array are ");
        for( i=0;i<n;i++)
        {
            System.out.print(marks[i]+"\t");
        }

        //length function in java
        // System.out.println("length of the array"+ marks.length);

     //sorting in array
     System.out.print(marks[i]+"\t");
     Arrays.sort(marks);//yeh sort kardega but print statement fir likhna padta hai
     System.out.println(marks[i]+"\t");

    }
}
