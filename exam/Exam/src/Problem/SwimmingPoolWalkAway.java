package Problem;

import java.util.Scanner;

public class SwimmingPoolWalkAway {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();  
	    int W = input.nextInt(); 
	    int totalArea = input.nextInt();  
	    
	    double a = 4;
	  	double b = 2 * (L + W);
	  	double c = L * W - totalArea;
	  	double x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	      
	  	System.out.print(x);
	      
	    input.close();
	    
	    
	   
	}
}
