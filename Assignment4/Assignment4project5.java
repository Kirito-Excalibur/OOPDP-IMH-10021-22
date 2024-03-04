class Area{
    double length;
    double breadth;
    double radius;
    double area;

    Area(int...data){
        if(data.length==1){
            radius=data[0];
            area=3.14*radius*radius;
            System.out.println("Radius of the Circle:- "+radius);
            System.out.println("Area of the Circle:- "+area);
        }
        else if(data.length==2){
            length=data[0];
            breadth=data[1];
            area=length*breadth;
            System.out.println("Length of the Rectangle:- "+length);
            System.out.println("Breadth of the Rectangle:- "+breadth);
            System.out.println("Area of the Rectangle:- "+area);
        }
    }
}

public class Assignment4project5 {
    public static void main(String[] args) {
        Area a1=new Area(5);
        Area a2=new Area(5, 10);
    }
}
