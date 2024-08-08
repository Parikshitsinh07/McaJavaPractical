import java.util.Scanner;

class Matrix {
    public void Addition(int a[][], int b[][], int size1, int size2,int size3,int size4) {
        int c[][] = new int[size1][size2];
		if(size1!=size3 && size2!=size4){
			System.out.println("Size of both matrix must be same !!");
		}
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public void Subtraction(int a[][], int b[][], int size1, int size2,int size3,int size4) {
        int c[][] = new int[size1][size2];
		if(size1!=size3 && size2!=size4){
			System.out.println("Size of both matrix must be same !!");
		}
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public void Multiplication(int a[][], int b[][], int size1, int size2, int size3) {
        int c[][] = new int[size1][size3];

        if (size2 != size3) {
            System.out.println("Matrix multiplication is not possible due to incompatible sizes.");
            return;
        }
		else{
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < size2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
}

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2, size3, size4;

        System.out.println("Enter the number of rows for the first matrix:");
        size1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        size2 = sc.nextInt();

        int a[][] = new int[size1][size2];

        // Take values for the first matrix
        System.out.println("Enter values for the first matrix:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
		

        System.out.println("Enter the number of rows for the second matrix:");
        size3 = sc.nextInt(); // Number of rows for the second matrix
        System.out.println("Enter the number of columns for the second matrix:");
        size4 = sc.nextInt();

        /*if (size2 != size4) {
            System.out.println("Matrix multiplication is not possible due to incompatible sizes.");
            return;
        }*/

        int b[][] = new int[size3][size4];

        // Take values for the second matrix
        System.out.println("Enter values for the second matrix:");
        for (int i = 0; i < size3; i++) {
            for (int j = 0; j < size4; j++) {
                b[i][j] = sc.nextInt();
            }
        }
		
		System.out.print("First matrix :\n");
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){
				System.out.print(a[i][j]+"  ");
			}System.out.print("\n");
		}
		
		System.out.print("Second matrix :\n");
		for(int i=0;i<size3;i++){
			for(int j=0;j<size4;j++){
				System.out.print(b[i][j]+"  ");
			}System.out.print("\n");
		}

        Matrix matrix = new Matrix();

        int option;

        do {
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Matrix Addition Result:");
                    matrix.Addition(a, b, size1, size2, size3, size4);
                    break;

                case 2:
                    System.out.println("Matrix Subtraction Result:");
                    matrix.Subtraction(a, b, size1, size2, size3, size4);
                    break;

                case 3:
                    System.out.println("Matrix Multiplication Result:");
                    matrix.Multiplication(a, b, size1, size2, size3);
                    break;

                case 4:
                    System.out.println("Program is terminated.");
                    break;

                default:
                    System.out.println("INVALID CHOICE...");
                    break;
            }
        } while (option != 4);
    }
}
