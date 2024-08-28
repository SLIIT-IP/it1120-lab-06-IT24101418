import java.util.Scanner;
 
 public class IT24101418Lab6Q1
 {
  public static void main(String [] args)
   {
    
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter a number :");
    double number = input.nextInt();

    double square = number*number;
    double squareRoot = Math.sqrt(number);

    System.out.println("The square of "+number+"is : "+square);
    System.out.println("The square root of "+number+"is : "+squareRoot);
   }
}