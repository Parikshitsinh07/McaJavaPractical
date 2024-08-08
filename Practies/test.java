import java.util.*;
class Demo{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter Your Number :");
			int Name = sc.nextInt();
			System.out.println("Your Number Is :"+ Name);
		}
		catch(InputMismatchException e){
			System.out.println("Enter a valid input");
		}
		
	}
}