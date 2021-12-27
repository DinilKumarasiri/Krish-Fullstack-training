import java.util.Scanner;


public class Main{
	public static Scanner sc ;
	public static void main(String [] args){
		System.out.println("Hello World");
		System.out.println("Enter Distance Fredy has to jump(in meter): ");
		sc = new Scanner(System.in);
		double distance = sc.nextDouble();
		FreddyJump j = new FreddyJump();
		System.out.println("Freddy wants "+ j.calculation(distance)[0] + " Seconds to end ");
		System.out.println("Freddy Jumps "+ j.calculation(distance)[1]+ " times");

		//int [] a = new int [2];
		//for (int b : a){
		//	System.out.println(a[b]);
		//}
		
	}
}