

import java.util.*;

public class Assignment2project1 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int sizeOfArray=sc.nextInt();
           System.out.println("Enter the number of elements of the array:-");
        int numberOfElements=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        
        System.out.println("Enter the elements");
        for(int i=0;i<numberOfElements;i++)
        {
            arr[i]=sc.nextInt();
        }
        
           System.out.println("The elements are");
        for(int i=0;i<numberOfElements;i++)
        {
           System.out.println(arr[i]); 
        }
    }
    
}
