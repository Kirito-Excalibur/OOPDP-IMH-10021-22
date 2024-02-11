
import java.util.*;

public class Assignment2project7 {

  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
          int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the position to divide the array:-");
        int dividePosition=sc.nextInt();
        
        int firstPart[]=new int[dividePosition];
        int secondPart[]=new int[n-dividePosition];
        
        System.arraycopy(arr, 0, firstPart, 0, dividePosition);
        System.arraycopy(arr, dividePosition, secondPart, 0, n-dividePosition);
        
        boolean hasDuplicates=false;
        
        System.out.println("Duplicate Elements in the Divided Array:");

        for (int i = 0; i < firstPart.length - 1; i++) {
            for (int j = i + 1; j < firstPart.length; j++) {
                if (firstPart[i] == firstPart[j]) {
                    System.out.println("Element: " + firstPart[i]);
                    hasDuplicates = true;
                }
            }
        }

        for (int i = 0; i < secondPart.length - 1; i++) {
            for (int j = i + 1; j < secondPart.length; j++) {
                if (secondPart[i] == secondPart[j]) {
                    System.out.println("Element: " + secondPart[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found in the divided array.");
        }
    }
    
}
