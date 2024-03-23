/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9prog1.pkg2;
import java.util.*;
/**
 *
 * @author PLAB-1
 */
public class Assignment9prog12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<String>();
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings to add");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arr.add(0,sc.next());
        }
        
        System.out.println("Enter string to remove");
        arr.remove(sc.nextInt());
        
        Collections.sort(arr);
        
        System.out.println(arr);
    }
    
}
