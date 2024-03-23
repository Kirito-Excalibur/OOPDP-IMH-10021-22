/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmnet9prog3;
import java.util.*;
/**
 *
 * @author PLAB-1
 */
public class Assignmnet9prog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        
        System.out.println("Number of values in arr1");
        int n=sc.nextInt();
        System.out.println("Enter elements in arr1");
        for (int i = 0; i < n; i++) {
            int j=sc.nextInt();
            arr1.add(j);
        }
        
           System.out.println("Number of values in arr2");
        int m=sc.nextInt();
        System.out.println("Enter elements in arr2");
        for (int i = 0; i < m; i++) {
            int k=sc.nextInt();
            arr2.add(k);
        }
        
        System.out.println(arr1.equals(arr2));
        arr1.addAll(arr2);
        System.out.println(arr1);
        int c=sc.nextInt();
                arr1.contains(c);
                System.out.println(arr1.contains(c));
 
        
                System.out.println("Maximum element is are:- "+Collections.max(arr1));
                System.out.println("Minimum element is are:- "+Collections.min(arr2));
                
           System.out.println("Enter the element to remove");
           arr1.remove(Integer.valueOf(sc.nextInt()));
           
           System.out.println("New array list:-");
           System.out.println(arr1);
        
    }
    
}
