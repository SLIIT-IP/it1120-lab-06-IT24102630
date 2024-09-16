import java.util.Scanner;
public class IT24102630Lab6Q1
{
	public static void main (String[]args)
  {
	double number;
	double square;
	double root;
	
	Scanner input= new Scanner (System.in);
	
	
	System.out.print("Enter a number: ");
	number = input.nextDouble();
	

	square = number * number;
	root = Math.sqrt(number);
	
	
	System.out.println();
	System.out.println("The square of "+ number +" is : "+ square);
	System.out.print("The square root of "+number+" is : "+root);
	
  }
  
}
	
	
	