
public class Assignment3project4 {

   
    public void anonymous(String...name){
        
        for (int i = 0; i < name.length; i++) {
            String str=name[i].toLowerCase();
            System.out.println(str);
            System.out.println("Length of string:-"+str.length());
        }
        
        
        
    }
    
    public static void main(String[] args) {
        Assignment3project4 t=new Assignment3project4();
        t.anonymous("Simon","Arielaa");
    }
    
}
