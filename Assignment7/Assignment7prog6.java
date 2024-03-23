/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment7;

class Person{
    String name;
    int age;
    
    Person(String n, int a)
    {
        name=n;
        age=a;
    }
    
    void display(){
        System.out.println("Name is:- "+name);
        System.out.println("Age is:- "+age);
    }
    
    class Student{
    int roll;
    int[] marks=new int[5];
    
    Student(int r, int[] m)
    {
        roll=r;
        marks=m;
    }
    
    void display(){
        
        Person.this.display();
        System.out.println("Roll:- "+roll);
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }

    }

    class Employee{
    int Salary;
    
    void display(){
        Person.this.display();
        System.out.println("Salary is:- "+Salary);
    }
    }


}



public class Assignment7prog6 {

  
    public static void main(String[] args) {
        int[] marks={10,29,39,11,40};
        Person p=new Person("Simon", 22);
        Person.Student k=p.new Student(21,marks);
        Person.Employee e=p.new Employee();
        
        k.display();
    }
    
}
