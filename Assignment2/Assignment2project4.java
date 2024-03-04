import java.util.Scanner;

public class Assignment2project4 {

   
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
        
  
        System.out.println("Enter the element to search for");
        int element=sc.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            if(arr[i]==element)
            {
                System.out.println("Element present at index:- "+i);
            }
        }
        
    }
    
    
}
