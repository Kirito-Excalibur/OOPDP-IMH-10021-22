/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9prog1;
import java.util.*;

public class Assignment9Prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Integer>arr=new ArrayList<Integer>();
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements to add");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(0,sc.nextInt());
        }
        
        System.out.println("Enter element to remove");
        arr.remove(sc.nextInt());
        
        Collections.sort(arr);
        System.out.println(arr);
    }
    
}
