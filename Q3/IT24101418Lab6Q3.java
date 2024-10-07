import java.util.Scanner;

public class IT24101418Lab6Q3{
 public static void main(String[]args){
 
//creat scanner
Scanner get = new Scanner(System.in);

//declare variables
int number;
double sum = 0;
double power,sqre_root;

//display
System.out.println("Enter positive integers(terminate input with -99):");

//take first number
System.out.println("Enter a number:");
number = get.nextInt();

//loop

while(number !=-99){
  if (number <0){
	System.out.println("Invalid input:please enter a positive integer or -99 to terminate");
	return;	
	}	
 power = Math.pow(number,2);
 sum = power+sum;
 System.out.println("Enter a number :");
 number = get.nextInt();
   }
 sqre_root = Math.sqrt(sum);
 System.out.println("The root Mean Square(RMS) is: "+sqre_root);
 }
}