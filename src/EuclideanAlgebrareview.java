/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class EuclideanAlgebrareview {

    public int gcd(int a , int b){
        
        //swap if a is lower number
        if(a < b){
            int temp = a;
            a = b;
            b = temp;  
        }
        
        //check if we are done
        if(b == 0){
            return a;
        } else {
            
            //find the values for a and b
            //int q = a/b;
            int r = a%b;
            
            //calculate new GCD
            return gcd(b,r);
        }
        
    }
    
    public static void main(String[] args) {
        
        EuclideanAlgebrareview test = new  EuclideanAlgebrareview();
        System.out.println("GCD TEST");
        System.out.println("GCD(1378 , 24)");
        int gcd = test.gcd(1378,24);
        System.out.println(gcd);
    }
}
