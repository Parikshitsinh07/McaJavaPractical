import java.util.Scanner;

class Utility
{
	
	public static boolean isEven(int no)
	{
		if(no%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public static boolean isOdd(int no)
	{
		if(no%2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public static boolean isPrime(int no)
	{
		boolean found = false;
	    if(no<=1)
		{
			return false;
		}		
		for(int i=1;i<no/2;i++)
			{	 
				if(no%i==0)
				{
					found = true;
				}
			}
		return found;
	}
		
	public static long factorial(long no)
	{	
		long fact=1;
		
		for(int i=1; i<=no; i++)
		{
			fact = fact*i;
		}
		return fact;
	}	
	
	public static void main(String [] args)
	{
		
		int no,option;
		long fact=1;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter Number : ");
			no = sc.nextInt();
			System.out.println("Project 1");
			System.out.println("1.CheckEven");
			System.out.println("2.CheckOdd");
			System.out.println("3.CheckPrime");
			System.out.println("4.Checkfactorial");
			System.out.println("0.exit");
			System.out.print("Select One Option:");
			option = sc.nextInt();
			switch(option)
			{
				case 1:
				{
					if (isEven(no))
					{
						System.out.println(no+" Number is Even");
					}
					else
					{
						System.out.println(no+" Number is not Even");
					}
						System.out.println();	
				}
				break;
				case 2:
				{
					if(isOdd(no))
					{
						System.out.println(no+" Number is Odd");
					}
					else
					{
						System.out.println(no+" Number is not Odd");
					}
						System.out.println();
				}
				break;
				case 3:
				{
					if(isPrime(no))
					{
						System.out.println(no+" Number is Prime");
					}
					else
					{
						System.out.println(no+" Number is not Prime");
					}
						System.out.println();
				}
				break;
				case 4:
				{
					fact = factorial(no);
					System.out.println("Factorial of "+no+" Number is : "+fact);
				}
				break;
				default:
				System.out.println("Invalid Option!!");
			}	
		}while(option != 0);
	}
}



