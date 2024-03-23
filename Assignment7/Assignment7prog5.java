/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;


class Base{
    
    void Display(){
        System.out.println("I am the Base");
    }
}

class Derived extends Base{
    
    void Display(){
        System.out.println("I am the Derived");
    }
    
    void show(){
        System.out.println("I don't know what to show");
    }
}

public class Assignment7prog5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base d=new Base();
        Base b= new Derived();
        d.Display();
        b.Display();
    }
    
}
