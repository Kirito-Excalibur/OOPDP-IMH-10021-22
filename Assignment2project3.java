
import java.util.Scanner;


public class Assignment2project3 {

  
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
        
   
        System.out.println("Enter the position of the element to delete");
        int indexForElementToDelete=sc.nextInt();
        
        for(int k=indexForElementToDelete;k<=numberOfElements;k++)
        {
            arr[k]=arr[k+1];

        }
        
        numberOfElements-=1;
        System.out.println("The elements are");
        for(int i=0;i<numberOfElements;i++)
        {
           System.out.println(arr[i]); 
        }
        
        
    }
    
    
}
