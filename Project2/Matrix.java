//package Parikshit;  
import java.util.*;
public class Matrix{ 
 public static void Addition(int[][] Matrix1,int[][] Matrix2,int size1,int size2){
	 	int [][] MatrixAdditon = new int [size1][size2];
		int i,j;
		System.out.println("\n \t Addition of Both Matrix is : ");
		for (i=0; i<size1; i++){
			System.out.println(" ");
			for ( j=0; j<size2; j++){
				MatrixAdditon[i][j] = Matrix1[i][j] + Matrix2[i][j];
				System.out.print("\t" +MatrixAdditon[i][j]);
			}
			System.out.println(" ");
		}
	
 }
 public static void Subtraction(int[][] Matrix1,int[][] Matrix2,int size1,int size2){
	 	int [][] MatrixAdditon = new int [size1][size2];
		int i,j;
		System.out.println("\n \t Subtraction of Both Matrix is : ");
		for (i=0; i<size1; i++){
			System.out.println(" ");
			for ( j=0; j<size2; j++){
				MatrixAdditon[i][j] = Matrix1[i][j] - Matrix2[i][j];
				System.out.print("\t" +MatrixAdditon[i][j]);
			}
			System.out.println(" ");
		}
	
 }
  public static void Multiplication(int[][] a,int[][] b,int size1,int size2){
	 	/*int [][] MatrixAdditon = new int [size1][size2];
		int i,j;
		System.out.println("\n \t Multiplication of Both Matrix is : ");
		for (i=0; i<size1; i++){
			System.out.println(" ");
			for ( j=0; j<size2; j++){
				MatrixAdditon[i][j] = Matrix1[i][j] * Matrix2[i][j];
				System.out.print("\t" +MatrixAdditon[i][j]);
			}
			System.out.println(" ");
		}
	int [][] MatrixAdditon = new int [r1][c1];
	
			System.out.println();
			System.out.println("Multiplication of Both Matrix is : ");
			for(int i=0;i<r1;i++){    
				for(int j=0;j<c2;j++){    
					MatrixAdditon[i][j]=0;      
					for(int k=0;k<r1;k++)      
					{      
					MatrixAdditon[i][j] += a[i][k] * b[k][j]; 
					System.out.print(" " +MatrixAdditon[i][j]);
					}					
				}
				System.out.println(" ");
				}*/
		int MatrixAddition [][] = new int [size1][size2];
		int i,j,k;
		System.out.println("Multiplication of Both Matrix is : ");
		for(i=0;i<size1;i++){
			for(j=0;j<size2;j++){
				MatrixAddition[i][j]=0;
				for(k=0;k<size1;k++){
				MatrixAddition[i][j] += a[i][k] * b[k][j];
				}
			}
		}
  }
 public static void main(String args[]){  
    int Matrix1[][],Matrix2[][];
	int size1,size2,i,j,option;
	Scanner sc= new Scanner(System.in);
	System.out.print("\t Enter Your Arry Rows lenght:");
    size1 =  sc.nextInt();  
	System.out.print("\t Enter Your Arry Colum lenght:");
    size2 =  sc.nextInt();
	System.out.println("\n Matrix Size is "+size1+"*"+size2);
    Matrix1= new int[size1][size2];   	
    Matrix2= new int[size1][size2];   
	System.out.println("\n\t Enter Your Frist Matrix Values \n");
	//using for loop scan Frist Matrix value
	for (i=0;i<size1;i++){
		System.out.println("This is "+(i+1)+" columan");
		for(j=0;j<size2;j++){
			System.out.print("Enter Your "+(j+1)+" Element:");
			Matrix1[i][j] = sc.nextInt();
		}
		System.out.println(" ");
	}

	System.out.println("\n Enter Your Second Matrix Values");
    //using for loop Scan Second Matrix values 	
	for (i=0;i<size1;i++){
		System.out.println("This is "+(i+1)+" columan");
		for(j=0;j<size2;j++){
			System.out.print("Enter Your "+(j+1)+" Element:");
			Matrix2[i][j] = sc.nextInt();
		}
		System.out.println(" ");
	}
	
	//using for loop print Frist Matrix
	System.out.println("\n \t This is Your Frist Matrix ");
	for(i=0;i<size1;i++){
				System.out.println(" ");
		for(j=0;j<size2;j++){
			System.out.print(" \t"+ Matrix1[i][j]+"");
		}
			System.out.println(" ");
	}
	//using for loop using for print Matrix
	System.out.println("\n \t This is Your Second  Matrix ");
	for(i=0;i<size1;i++){
				System.out.println(" ");
		for(j=0;j<size2;j++){
			System.out.print(" \t"+ Matrix2[i][j]+"");
		}
		System.out.println(" ");
	}
	
	do{
		System.out.println("1.Matrix Additon");
			System.out.println("2.Matrix Subtraction ");
			System.out.println("3.Matrix Multiplication");
			System.out.println("4.Exit");
			System.out.print("Please Select One Option: ");
			option = sc.nextInt();
            switch(option){
				case 1:Addition(Matrix1,Matrix2,size1,size2);
						 break;
				case 2:Subtraction(Matrix1,Matrix2,size1,size2);
						 break;
				case 3:Multiplication(Matrix1,Matrix2,size1,size2);
						 break;
				case 4:System.out.println("\n \t Program is Exit  \n\n");
				default:
					break;
			}
	}while(option<4);
   }  
} 