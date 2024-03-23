/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment10;

import java.util.*;
public class Assignment10prog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int arr[]=new int[5];
    
    Scanner sc=new Scanner(System.in);
    try{
        System.out.println("Enter the array elements");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[5]);
        for (int i = 0; i < 5; i++) {
            int c=arr[i]/arr[i+1];
        }
        
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Life is wierd");
    }
    }
    
}
