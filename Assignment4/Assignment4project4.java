
class Student{
    int student_roll;
    String student_name;
    int[] student_marks=new int[5];

    Student(int roll, String name, int[] marks){
        student_roll=roll;
        student_name=name;
        student_marks=marks;
    }

    void Average(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=student_marks[i];
        }
        System.out.println("Average Marks:- "+(sum/5));
    }
}

public class Assignment4project4 {
public static void main(String[] args) {
    Student s=new Student(21, "Kirito", new int[]{25, 11, 100, 78, 90});
    Student k=new Student(22, "Asuna", new int[]{32, 22, 44, 100, 56});
    Student  r=new Student(23, "Alice", new int[]{76, 37, 23, 11, 80});
    s.Average();
    k.Average();
    r.Average();
}

}
