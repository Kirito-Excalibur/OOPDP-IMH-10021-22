
public class Assignment3project6 {

    public void promotion(int val){
        System.out.println("Type Demotion:-"+val);  
    }
    
     public void promotion(double a,double b){
         System.out.println("Type Promotion:-"+(a+b));
    }
   
    public static void main(String[] args) {
        Assignment3project6 t=new Assignment3project6();
        t.promotion((int)24.0);
        t.promotion(22,15);
    }
    
}
