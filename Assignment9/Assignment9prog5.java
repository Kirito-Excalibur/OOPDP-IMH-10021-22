/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9prog5;
import java.util.*;

public class Assignment9prog5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str2=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            str2=str.charAt(i)+str2;
        }
        
        System.out.println("Reversed String:- "+str2);
        
       
    }
    
}
