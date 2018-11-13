import java.util.Scanner;

public class UserInterface {
    public static void main (String [] args){
       
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your polynomial");
        String userInput = scanner.nextLine().replaceAll("\\s*","");

        if(userInput.charAt(0) != '-'){ 
        	
        	// not negative
        	
            userInput = "+" + userInput;
        }

        System.out.println("The derivative of your polynomial is: ");
        
        PolynomialDerivative.Everything(userInput);
        PolynomialDerivative.Polynomials(userInput);
        
        scanner.close();
    }
}
