

import java.util.Scanner;


public class Assignment2project2 {

  
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
        
   
        System.out.println("Ener the element to insert");
        int elementToInsert=sc.nextInt();
        System.out.println("Enter the position of the element to insert");
        int indexForElementToInsert=sc.nextInt();
        
        for(int k=numberOfElements-1;k>=indexForElementToInsert;k--)
        {
            arr[k+1]=arr[k];
            if(k==indexForElementToInsert)
            {
                arr[k]=elementToInsert;
                numberOfElements+=1;
            }
        }
        
        
            System.out.println("The elements are");
        for(int i=0;i<numberOfElements;i++)
        {
           System.out.println(arr[i]); 
        }
        
        
    }
    
    
}
