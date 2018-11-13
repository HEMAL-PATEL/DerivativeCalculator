import java.util.regex.*;
public class PolynomialDerivative {

    
    public static void Polynomials(String userInput){
         
        Pattern polynomials = Pattern.compile("(?:([+-])([\\d\\.]*)x(?:\\^([-]?[\\d\\.]+))?)"); 
        Matcher polynomialsMatcher = polynomials.matcher(userInput);

        boolean first = true; 
        while(polynomialsMatcher.find()){ 

            
            double coefficient = 1; 
            if(polynomialsMatcher.group(2) != null && polynomialsMatcher.group(2).length() > 0)
                coefficient = Double.parseDouble(polynomialsMatcher.group(2));

            
            double power = 1; 
            if(polynomialsMatcher.group(3) != null)
                power = Double.parseDouble(polynomialsMatcher.group(3));

           
            boolean outputSign = (polynomialsMatcher.group(1).equals("+") == power >= 0); 

            double outputCoefficient = Math.abs(coefficient * power);
            double outputPower = power - 1;

            if(first && !outputSign) {
                System.out.print(" -");
            } else if(!outputSign){
                System.out.print("- ");
            } else if(!first && outputSign){
                System.out.print("+ ");
            }
            if (outputPower == 1){
                System.out.print(outputCoefficient + "x ");
            } else if (outputPower == 0){
                System.out.print(outputCoefficient + " ");
            } else {
                System.out.print(outputCoefficient + "x^" + outputPower + " ");
            }

            if(first)
                first = !first;
        }
    }

    
    public static void Everything(String userInput){
        Pattern E = Pattern.compile("(?:([+-])([\\d\\.]*)e(?:\\^([-]?[\\d\\.]*))?x?)");
        Matcher EMatcher = E.matcher(userInput);

        while(EMatcher.find()){ 

            
            double coefficient = 1; 
            if(EMatcher.group(2) != null && EMatcher.group(2).length() > 0)
                coefficient = Double.parseDouble(EMatcher.group(2));

           
            double power = 1; 
            if(EMatcher.group(3) != null)
                power = Double.parseDouble(EMatcher.group(3));

           
            boolean outputSign = (EMatcher.group(1).equals("+") && power >= 0); 

            double outputCoefficient = coefficient * power;
            double outputPower = power;

           

            System.out.print(outputCoefficient + "e^" + outputPower + "x");

            
        }
    }
}
