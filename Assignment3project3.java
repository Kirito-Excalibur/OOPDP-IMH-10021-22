
public class Assignment3project3 {

    public void check(int...val){
        int maximum=val[0];
        int sum=0;
        int TotalNumberOfArguments=val.length;
        System.out.println("Total number of arguments:-"+TotalNumberOfArguments);
        
        for (int i = 1; i < val.length; i++) {
            if(maximum<val[i])
            {
                maximum=val[i];
            }
        }
        
        System.out.println("Maximum of numbers:-"+maximum);
        
        for (int i = 0; i < val.length; i++) {
            sum+=val[i];
        }
        
        System.out.println("Sum of all the elements:-"+sum);
        
        
        
    }
    
    public static void main(String[] args) {
       Assignment3project3 t=new Assignment3project3();
       t.check(4,3,1);
    }
    
}
