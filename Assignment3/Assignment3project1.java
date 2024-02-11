
public class Assignment3project1 {

    public void Area(double length, double breadth){
        double area=length*breadth;
        System.out.println("Area of rectangle is:-"+area);
    }
    
    public void Area(double radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is:-"+area);
    }
    
    public void Area(int side){
         int area=side*side;
        System.out.println("Area of square is:-"+area);
    }
    
    public void Perimeter(int length, int breadth){
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is:-"+perimeter);
    }
    
     public void Perimeter(double radius){
        double perimeter=2*3.14*radius;
        System.out.println("Perimeter of circle is:-"+perimeter);
    }
     
       public void Perimeter(int side){
        int perimeter=side*4;
        System.out.println("Perimeter of square is:-"+perimeter);
    }
     
    
    
    public static void main(String[] args) {
        Assignment3project1 t=new Assignment3project1();
        t.Area(10.0,20.0);
        t.Area(10.0);
        t.Perimeter(20);
        t.Perimeter(12,14);
    }
    
}
