class Parent{
    
    void showParent()
    {
        System.out.println("I am the aprent");
    }
}

class Child extends Parent{
    void showChild()
    {
        System.out.println("I am the child");
    }
}

public class Assignment5project1 {

   
    public static void main(String[] args) {
        Child c=new Child();
        
        c.showChild();
        c.showParent();
    }
    
}
