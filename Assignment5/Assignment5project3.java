
class Student{
    
    void studentClass(){
        System.out.println("I am a student");
    }
}

class CSE extends Student{
    void studentClass(){
        System.out.println("I am a CSE student");
    }
}

class CSEAI extends CSE{
    void studentClass(){
        System.out.println("I am a CSE AI student");
    }
}

public class Assignment5project3 {

   
    public static void main(String[] args) {
        Student s=new Student();
        CSE c=new CSE();
        CSEAI A=new CSEAI();
        
        s.studentClass();
        c.studentClass();
        A.studentClass();
    }
    
}
