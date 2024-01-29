

import java.util.*;

public class Assignment2project5 {

   
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the arr:-");
        int sizeOfArray=sc.nextInt();
           System.out.println("Enter the number of elements of the arr:-");
        int numberOfElements=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        
        System.out.println("Enter the elements");
        for(int i=0;i<numberOfElements;i++)
        {
            arr[i]=sc.nextInt();
        }

        boolean hasDuplicates = false;

        System.out.println("Duplicate Elements are:");

        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   
                    System.out.println(" Element: " + arr[i]);
                    hasDuplicates = true;
                    break; 
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
    
}
