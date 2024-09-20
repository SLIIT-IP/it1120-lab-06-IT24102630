import java.util.Scanner;
public class IT24102593Lab6Q1 {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = value.nextInt();

        double squareOfNumber = number * number;
        System.out.println("The square of" + number+" is : " + squareOfNumber);

        double squareRootOfNumber = Math.sqrt(number);
        System.out.println("The square root of " + number + " is : " + squareRootOfNumber);

    }

}
	
	
	
