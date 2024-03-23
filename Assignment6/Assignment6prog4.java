/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment6;

import Employee;

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
public class Assignment6prog4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Life iws");
       Person p=new Employee();
        System.out.println(Person.a);
        p.display();
        
    }
    
}
