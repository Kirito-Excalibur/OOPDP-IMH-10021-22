
public class Assignment3project5 {

   public void reverse(int...val){
       int sum=0;
       int reversedSum=0;
       for (int i = 0; i < val.length; i++) {
           sum+=val[i];
       }
       
       while(sum!=0)
       {
           int digit=sum%10;
           reversedSum=reversedSum*10+digit;
           sum=sum/10;
       }
       
       System.out.println("Reversed Sum:-"+reversedSum);
       
   }
    
    public static void main(String[] args) {
        Assignment3project5 t=new Assignment3project5();
        t.reverse(5,2,11);
    }
    
}
