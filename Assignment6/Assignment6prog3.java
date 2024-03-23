/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment6;

import Assignment7.Circle;
import Assignment7.Rectangle;
import Assignment7.Shape;

abstract class Shape{
 
    abstract void perimeter();
    abstract void area();
    
}

class Circle extends Shape{
    int radius;
    Circle(int r){
        radius=r;
    }
       void area(){
        System.out.println("Area of Circle :-"+(3.14*radius*radius));
    }
    
    void perimeter(){
        System.out.println("Perimeter of Circle :-"+(2*3.14*radius));
    }
    
}

class Rectangle extends Shape{
    
    int length;
    int breadth;
    
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    
    void area(){
        System.out.println("Area of Rectangle :-"+(length*breadth));
    }
    
    void perimeter(){
        System.out.println("Perimeter of Rectangle :-"+(2*(length+breadth)));
    }
}

public class Assignment6prog3 {


    public static void main(String[] args) {
    
        Shape r=new Rectangle(10,10);
        Shape c=new Circle(10);
        
        r.area();
        r.perimeter();
        c.area();
        c.perimeter();
    }
    
}
