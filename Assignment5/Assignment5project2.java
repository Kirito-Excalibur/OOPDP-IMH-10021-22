

class Bird{
    
    void fly(){
        System.out.println("Birds can fly!");
    }
}

class Parrot extends Bird
        {
    void showColor(){
        System.out.println("My color is green");
    }
}

class Crow extends Bird
        {
    void showColor(){
        System.out.println("My color is black");
    }
}
public class Assignment5project2 {

 
    public static void main(String[] args) {
        Parrot p=new Parrot();
        Crow c=new Crow();
        p.fly();
        p.showColor();
        c.fly();
        c.showColor();
    }
    
}
