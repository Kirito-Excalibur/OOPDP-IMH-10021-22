class Employee{
    int Employee_id;
    String Employee_name;
    String Employee_department;

    void set(int id, String name, String department){
        Employee_id=id;
        Employee_name=name;
        Employee_department=department;
    }

    void display()
    {
        System.out.println("Employee id:- "+Employee_id);
        System.out.println("Employee name:- "+Employee_name);
        System.out.println("Employee department:- "+Employee_department);
    
    }
}

public class Assignment4project1 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.set(1, "Kirito", "SAO");
        e.display();
    }
}
