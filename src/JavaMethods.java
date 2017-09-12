/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class JavaMethods {
    
     public void helloWorld(){
         System.out.println("Hello world");
         
     }  
     
     public void helloWorld(String name){
         System.out.println("Hello " + name);
     }
     
     public int sumRange(int start, int end){
         int sum = 0;
         for(int i = start ; i <= end; i++){
             sum = sum + i;
         }
         return sum;
     }
        

    
    public static void main(String[] args) {
        //create a varaible to test object
        JavaMethods test = new JavaMethods();
        test.helloWorld();
        test.helloWorld("Steve");
        int total = test.sumRange(5, 10);
        System.out.println(total);
    }
}
