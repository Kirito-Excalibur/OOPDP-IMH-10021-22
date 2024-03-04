
public class Assignment3project2 {

  
    public void info(String name){
        
        boolean isAlphabetic=true;
        
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            if(!Character.isAlphabetic(ch)){
                isAlphabetic=false;
                break;
            }
        }
        
        if(isAlphabetic){
            System.out.println("Name is validated");
        }
        else{
            System.out.println("Name is not validated");
        }
    }
    
    public void info(int age){
        
        
       if(age>3 && age<15)
       {
            System.out.println("Age is validated");
        }
        else{
            System.out.println("Age is not validated");
        }
    }
    
    
    
    public static void main(String[] args) {
       Assignment3project2 t = new Assignment3project2();
       t.info(12);
       t.info("Kirito");
    }
    
}
