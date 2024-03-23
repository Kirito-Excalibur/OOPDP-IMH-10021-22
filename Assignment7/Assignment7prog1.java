/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;

class Shape{
    
    void getArea(){
        System.out.println("What Shape are you talking about?");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    
    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    void getArea(){
        System.out.println("Area of Rectangle:- "+(length*breadth));
    }
}

class Box extends Rectangle{
    int height;
    
    Box(int length, int breadth, int height){
        super(length,breadth);
        this.height=height;
    }
    
    void getArea(){
        System.out.println("Area of Box:- "+(2*super.length*super.breadth+2*super.length*this.height+2*this.height*super.breadth));
    }
}

public class Assignment7prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape s=new Shape();
       Rectangle r=new Rectangle(10,10);
       Box b=new Box(11,12,13);
       s.getArea();
       r.getArea();
       b.getArea();
    }
    
}
