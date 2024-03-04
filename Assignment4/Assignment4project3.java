
class Student{
    int student_roll;
    String student_name;
    int[] student_marks=new int[5];

    Student(){
        this.student_name="Unknown";
        this.student_roll=0;
        for(int i=0;i<5;i++){
            student_marks[i]=0;
        }
    
    }

    Student(int roll, String name, int[] marks){
        student_roll=roll;
        student_name=name;
        student_marks=marks;
    }

    void display(){
        System.out.println("Student Roll:- "+student_roll);
        System.out.println("Student Name:- "+student_name);
        System.out.println("Student Marks:- ");
        for(int i=0;i<5;i++){
            System.out.println(student_marks[i]);
        }
    
    }
}

public class Assignment4project3 {
    public static void main(String[] args) {
       Student s=new Student(21, "Kirito", new int[]{100, 100, 100, 100, 100});
       s.display();
    }
}
