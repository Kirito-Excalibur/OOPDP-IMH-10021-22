/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;

class Circle{
    double radius;
    
    double area(){
        return 3.14*radius*radius;
    }
    
    void set_width(){
        
    }
    
    void perimeter(){
        
    }
    
    void circumference(){
        
    }
}

class Cylinder extends Circle{
    double height;
    double volume(){
        double area=super.area();
        return height*area;
    }
}

public class Assignment7prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=4;
        c.height=10;
        double volume=c.volume();
        System.out.println("Volume is:- "+volume);
    }
    
}
