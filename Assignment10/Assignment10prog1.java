/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment10;




public class Assignment10prog1 {

    public void finalize(){
        System.out.println("Object collected");
    }
  
    public static void main(String[] args) {
   Assignment10prog1 m=new Assignment10prog1();
   Assignment10prog1 m1=new Assignment10prog1();
   m1=null;
   m=null;
   System.gc();
        
        
    }
    
}
