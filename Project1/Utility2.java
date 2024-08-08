//package Parikshit;  
import java.util.*;
class Utility2{
		public static long factorial(int value){
			 int i,fact=1;  
			 int number=value;//It is the number to calculate factorial    
				for(i=1;i<=number;i++){    
						fact=fact*i;    
							}
                 return fact;							
	 
		}
		public static boolean isPrime(int no){
			int i , count=0;
			 if(no == 0 || no == 1){
					return false;      
				}else{  
					for(i=2;i<=no/2;i++){      
						if(no%i==0){
							count++;
							break;
						}      
					}      
				if(count == 0) { 
					return true;
					}  
				else{
					return false;
				}
				}
		}
		public static boolean isEven(int no){
			if (no%2==0){
				return true;
			}
			else{
			return false;
			}
		}	
		public static boolean isOdd(int no){
			if (no%2!=0){
				return true;
			}
			else{
			return false;
			}
		}
 public static void main(String args[]){  
		int value=0,option;
		long answar;
		boolean prime,even,odd;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.Faind Factorial");
			System.out.println("2.Chack Number is Prime Or Note");
			System.out.println("3.Chack Number is Even Or Note");
			System.out.println("4.Chack Number is Odd Or Note");
			System.out.println("5.Exit");
			System.out.print("Please Select One Option: ");
			option = sc.nextInt();
			switch(option){
				case 1:System.out.print("Enter Your Number: ");
						value = sc.nextInt();
						answar= factorial(value);
						System.out.println("\n\n \t Factorial of "+value+" is: "+answar+"\n\n");
						break;
				case 2:System.out.print("Enter Your Number: ");
						value = sc.nextInt();
						prime = isPrime(value);
						if(prime){
							System.out.println("\n\n \t"+value+ " is prime number \n\n"); 
						}else{
							System.out.println("\n\n \t"+value+" is Note prime number \n\n");
						}
						break;
				case 3:System.out.print("Enter Your Number: ");
						value = sc.nextInt();
						even = isEven(value);
						if(even){
							System.out.println("\n \t"+value + " is Even number \n");
						}
						else{
							System.out.println("\n \t"+value + " is Note Even number \n");
						}
						break;
				case 4:System.out.print("Enter Your Number: ");
						value = sc.nextInt();
						odd = isOdd(value);
						if(odd){
							System.out.println("\n \t"+value + " is Odd number \n");
							
						}
						else{
							System.out.println("\n \t"+ value + " is Note Odd number \n");
						}
						break;
				case 5: System.out.println("\n \t Program is Exit  \n\n");
				default:
						System.out.println("\n Please Enter a Valide input \n");
						break;
			}
						
		}while(option<=4);
   }  
}  