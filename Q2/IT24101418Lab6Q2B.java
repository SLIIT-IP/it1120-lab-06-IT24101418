import java.util.Scanner;
public class IT24101418Lab6Q2B{
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
	    place = place +1 ;
            count++ ; //count = count+1
        }
	
	
        System.out.println("The numbers you entered are :");
	
	place =0;
        while(place<10){
            System.out.print(number[place]+" ");
            place = place+1 ;
        }


    }
}