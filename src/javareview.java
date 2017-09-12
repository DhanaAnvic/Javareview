
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class javareview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize the variables
        //type the name [ = value ];
        int age = 10;
        double length = 25.73;
        
        //math options
        // + addtion
        // - subtraction
        // * multiplication
        // / division
        // % modulus (remainder after division)
        age = age + 10;
        length = length * 2;
        age++; //adds 1 to age
        age--; // subtract 1 from age
        
        // conditions
        if(length > 100){
            System.out.println("Length is bigger than 100");
            
        }else if (length > 50 && length <=100){
            System.out.println("Length is between 50 and 100");
        }else{
            System.out.println("Length is 50 or lower");
        }
        
        //while loops
        // && <= AND
        // || <= OR
        int count = 0;
        while(count < 10){
            //increase amount and print
            count++;
            System.out.println(count);
        }
        
        //for loop
        for(int i = 0; i < 10; i++){
            System.out.println("i; " + i);
        }
        
        //arrays
        //storing on where the variable is
        String[] words = new String[5];
        words[0] = "cat";
        
        //input
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a Word");
            words[i] = in.nextLine();
            
            if (words[i].equals("EXIT")){
                break;
            }
            
            int wordLength = words [i].length();
            
            
        }

    }
}
