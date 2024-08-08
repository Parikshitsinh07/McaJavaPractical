import java.util.Scanner;
public class ArrayPrinter {

    // Generic function to print the entire array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n"); // Move to the next line after printing the array
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choise;
		try
		{
			do
			{
				System.out.println("Select Which type You Create a Array");
				System.out.println("1.Integer Array");
				System.out.println("2.Double Array");
				System.out.println("0.exit");
				System.out.print("Select One Option:");
				choise =scanner.nextInt();
				System.out.print("Enter the size of the array: ");
				int size = scanner.nextInt();
				switch(choise)
				{
					case 1:Integer[] Array1 = new Integer[size];
						for(int i = 0; i < size; i++)
						{
							System.out.println("Enter Your value:");
								Array1[i] = scanner.nextInt();
						}
						printArray(Array1);
						break;
					case 2:Double[] Array2 = new Double[size];
						for(int i = 0; i < size; i++)
						{
							System.out.println("Enter Your value:");
								Array2[i] = scanner.nextDouble();
						}
						printArray(Array2);
						break;
					case 4:System.out.print("Program Exit");
						break;
					default:
						System.out.print("Invalid Option");
				}
			}while(choise!=0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        /* Example usage with an array of integers
		
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Example usage with an array of strings
        String[] stringArray = new Integer[size];
		String[] stringArray = {"apple", "banana", "orange"};
        System.out.print("String Array: ");
        printArray(stringArray);

        // Example usage with an array of doubles
        
		 Double[] doubleArray = {1.5, 2.7, 3.2};
        System.out.print("Double Array: ");
		*/
        
    }
}
