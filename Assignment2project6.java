
import java.util.*;

public class Assignment2project6 {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int odd[]=new int[n];
        int even[]=new int[n];
        int oddIndex=0;
        int evenIndex=0;
         System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0)
            {
                even[evenIndex++]=arr[i];
            }
            else
            {
                odd[oddIndex++]=arr[i];
            }
        }
        
        System.out.println("Original Array:-");
          for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+" ");
        }
          
        System.out.println("\n  Even Array:-");
          for (int i = 0; i < evenIndex; i++) {
              System.out.print(even[i]+" ");
        }
          
            System.out.println("\n Odd Array:-");
          for (int i = 0; i < oddIndex; i++) {
              System.out.print(odd[i]+" ");
        }
        
    }
    
}
