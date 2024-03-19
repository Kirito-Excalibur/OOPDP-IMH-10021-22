/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9prog4;
import java.util.*;
/**
 *
 * @author PLAB-1
 */
public class Assignment9prog4 {

    
    public static void main(String[] args) {
        boolean isAnagram=true;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
       String a=sc.next();
        System.out.println("Enter second string");
       String b=sc.next();
       
        for (int i = 0; i < a.length(); i++) {
            if(b.indexOf(a.charAt(i))==-1)
            {
                 isAnagram=false;
                 break;
            }
            else if(a.indexOf(b.charAt(i))==-1)
            {
                     isAnagram=false;
                     break;
            }
           
        }
        
       if(isAnagram==true){
           System.out.println("Strings are anagram");
       }
       else
       {
             System.out.println("Strings are not anagram");
       }
          
//        System.out.println(a.indexOf(b.charAt(3)));
    }
    
}
