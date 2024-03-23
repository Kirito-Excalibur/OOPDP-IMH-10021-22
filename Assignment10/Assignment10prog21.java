/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment10;

import Assignment6.Employee;

class Employee{
    int ID;
    String name;
    int age;
    static int nextID=1;
    
    
    
    Employee(String Name,int Age)
    {
        this.ID=nextID++;
        this.name=Name;
        this.age=Age;
    }
    
       public void finalize()
    {
        --nextID;
        System.out.println("Final number of employees:- "+(--nextID));
        
    }
    
    void show(){
        System.out.println("Employee ID:- "+this.ID);
        System.out.println("Name is:- "+this.name);
        System.out.println("Age is:- "+this.age);
    }
    void showNext(){
        System.out.println("Next employee ID will be:- "+nextID);
    }
}

public class Assignment10prog21 {

  
    
    public static void main(String[] args) {
       Employee E1=new Employee("Simon",21);
        Employee E2=new Employee("Chandu",21);
        E1.show();
        E2.show();
        E2.showNext();
        E2=null;
        
        
        System.gc();
    }
}
