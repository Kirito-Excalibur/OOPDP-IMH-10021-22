/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment9prog6;

import java.util.*;
public class Assignment9prog6 {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    String a=sc.next();
    String temp="";
        for (int i = 0; i < a.length(); i++) {
            
            if(a.charAt(i)!='0')
            {
                temp=temp+a.charAt(i);
            }
        }
    
        a=temp;
        System.out.println(a);
    }
    
}
