/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class RecursionExamples {
    
    //Returns the nth Fibbinacci number using a loop
    //n = the nth number we want in the sequence
    
    public int fibLoop(int n){
        
        //an array to store in sequence
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        
        //fixing the boundary condition
        if(n > 0){
            numbers[1] = 1; 
        }
        
        //building the sequence
        for(int i = 2; i < n + 1; i++){
            numbers[i] = numbers [i - 1] + numbers [i - 2];           
    }
        //returning the number
        return numbers[n];
    }
    

    public static void main(String[] args) {
        
        //testing the recursion
        RecursionExamples test = new RecursionExamples();
        
        //testing the boundaries
        int bound1 = test.fibLoop(0);
        System.out.println("Oth : " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1th : " + bound2);
        int norm = test.fibLoop(16);
        System.out.println("5th : " + norm);
        
    }
}
