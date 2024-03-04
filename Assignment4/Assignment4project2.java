
class Car{
    String brand;
    Car(String brand){
        this.brand=brand;
    }

    void getBrand(){
        System.out.println("Brand:- "+this.brand);
    }
}

public class Assignment4project2 {
    public static void main(String[] args) {
        Car c=new Car("Audi");
        c.getBrand();
    }
}
