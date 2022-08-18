package lab;
import java.util.*;

public class Calcuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// stores two numbers
        double number1, number2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();
        
        System.out.println("Enter the operator (+,-,*,/)");
        char a = sc.next().charAt(0);
        double c=0;
        
        switch(a) {
        case '+':
        	System.out.println("sum;");
        	c= number1 + number2;
        	break;
        
        case '-':
        	 c = number1- number2;
        	  break;
        case '*':
       	 c = number1* number2;
       	  break;
       	  
        case '/':
       	 c = number1 / number2;
       	  break;
       	  
     
        	  
        }
        System.out.println("The final result:");
        
        System.out.println();
        
        System.out.println(number1 + " " + a + " " + number2
                + " = " +c);
        
        
	}

}
