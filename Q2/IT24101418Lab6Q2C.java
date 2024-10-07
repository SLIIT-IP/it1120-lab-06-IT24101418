import java.util.Scanner;
public class IT24101418Lab6Q2C{
    public static void main(String[] args) {
       //create scanner
       Scanner get = new Scanner(System.in);

       int count = 1;

       //creat array
       int[] number = new int[10];
       int place = 0 ;

        System.out.println("please enter 10 numbers:");

        //loop
        while(count<=10){
            System.out.println("Enter number "+count+":");
            number[place] = get.nextInt();
	    place++ ;
            count++ ; //count = count+1
        }
	
	
        System.out.println("The numbers you entered are :");
	
	place =0;
	int sum =0;
        while(place<10){
            System.out.print(number[place]+" ") ;
	    sum = sum + number[place];
            place++ ;
        }

	double avg = sum/place ;

	System.out.println ("sum of the number :"+sum);
	System.out.println ("average of the number :"+avg);


    }
}