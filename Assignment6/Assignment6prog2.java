/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment6;

abstract class Bike{

   abstract void run();
}

class Honda extends Bike{
    
   void run(){
        System.out.println("Bike is not safe");
    }
}
public class Assignment6prog2 {

  
    public static void main(String[] args) {
      Bike h=new Honda();
      h.run();
    }
    
}
