/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment6prog4.pkg1;


interface Person{
    
    static int a=25;
    static void entire(){
        System.out.println("I am a person");
    }
    
    abstract void display();
}

class Employee implements Person{
    
   public void display(){
        System.out.println("I am an employee");
    }
    
}

public class Assignment6prog41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p=new Employee();
        System.out.println(Person.a);
        p.display();
    }
    
}
