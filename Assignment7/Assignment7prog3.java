/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;

class Rectangle{
    int length;
    int breadth;
    
    Rectangle(){
        length=1;
        breadth=1;
    }
    
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
}

class Cuboid extends Rectangle{
    int height;
    
    Cuboid(){
    height=1;
}
    
    Cuboid(int height){
        this.height=height;
    }
    
    double Volume()
    {
        return super.length*super.breadth*this.height;
    }
    
}
public class Assignment7prog3 {

   
    public static void main(String[] args) {
       Cuboid c=new Cuboid();
       Cuboid k=new Cuboid(25);
       double result=c.Volume();
       double result2=k.Volume();
        System.out.println("Printed volume:-"+result);
        System.out.println("Printed Volume2:-"+result2);
    }
    
}
