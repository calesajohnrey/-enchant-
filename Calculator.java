import java.util.Scanner;
public class Calculator


{
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number");
    int numA = input.nextInt();

    System.out.println("Enter second number");
    int numB = input.nextInt();
    
    System.out.println(numA - numB);
	}
}