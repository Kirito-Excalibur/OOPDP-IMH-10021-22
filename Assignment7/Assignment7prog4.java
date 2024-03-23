/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;

class Binod{
    String name;
    
    Binod(String name){
        this.name=name;
    }
}

class Binodni extends Binod{
    
    Binodni()
    {
        super("Binod");
        System.out.println("Name is:-"+super.name);
    }
    
    
}

public class Assignment7prog4 {


    public static void main(String[] args) {
        Binodni b= new Binodni();
    }
    
}
