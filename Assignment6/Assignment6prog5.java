/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment6;

abstract class Base1{
    abstract class Base2{
        abstract void display();
    }
}

class Derived1 extends Base1{
    class Derived2 extends Base2{
        void display(){
            System.out.println("Life is wierd");
        }
        
     
    }
       Derived2 d=new Derived2();
}

public class Assignment6prog5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Derived1 a=new Derived1();
      a.d.display();
       
    }
    
}
