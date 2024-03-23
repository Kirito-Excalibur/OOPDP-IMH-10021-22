/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment6;

class Outer{
    
   static class Inner{
//       int abc=20;
          void display()
        {
            System.out.println("life is wierd");
        }
    }
}

public class Assignment6prog1 {


    public static void main(String[] args) {
        Outer.Inner in=new Outer.Inner();
        in.display();
//        System.out.println(in.abc);
    }
    
}
