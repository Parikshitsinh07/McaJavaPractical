import java.util.Scanner;

class Matrix {
     double[][] matrix;
     int row;
     int cols;
	//Default Constructor
	 public Matrix() {
        this.row = 2;
        this.cols = 2;
        matrix = new double[row][cols];
    }
    // Second Constructor 
    public Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        matrix = new double[row][cols];
    }

    // Constructor 
    public Matrix(double[][] data) {
        this.row = data.length;
        this.cols = data[0].length;
        matrix = new double[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = data[i][j];
            }
        }
    }

    // Method to transpose the matrix
    public Matrix transpose() {
        Matrix t = new Matrix(cols, row);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                t.matrix[j][i] = this.matrix[i][j];
            }
        }
        return t;
    }

    // Method to add two matrices and return the result
    public Matrix add(Matrix m) {
        if (row != m.row || cols != m.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        Matrix result = new Matrix(row, cols);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices and return the result
    public Matrix sub(Matrix m) {
        if (row != m.row || cols != m.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        Matrix result = new Matrix(row, cols);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices and return the result
    public Matrix mul(Matrix m) {
        if (cols != m.row) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        Matrix result = new Matrix(row, m.cols);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m.cols; j++) {
                double sum = 0.0;
                for (int k = 0; k < cols; k++) {
                    sum += this.matrix[i][k] * m.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }
        return result;
    }

    // Override toString() method to print the matrix
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	try{
        // Get input for the first matrix
        System.out.println("Enter the number of rows for Matrix 1:");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix 1:");
        int cols1 = sc.nextInt();
        Matrix m1 = new Matrix(rows1, cols1);

        System.out.println("Enter the values for Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                m1.matrix[i][j] = sc.nextDouble();
            }
        }

        // Get input for the second matrix
        System.out.println("Enter the number of rows for Matrix 2:");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix 2:");
        int cols2 = sc.nextInt();
        Matrix m2 = new Matrix(rows2, cols2);

        System.out.println("Enter the values for Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                m2.matrix[i][j] = sc.nextDouble();
            }
        }

        // Perform operations
        Matrix m3 = m1.add(m2);
        Matrix m4 = m1.sub(m2);
        Matrix m5 = m1.mul(m2);
        Matrix m6 = m1.transpose();

        // Print results
        System.out.println("Matrix 1:");
        System.out.println(m1);

        System.out.println("Matrix 2:");
        System.out.println(m2);

        System.out.println("Matrix 1 + Matrix 2:");
        System.out.println(m3);

        System.out.println("Matrix 1 - Matrix 2:");
        System.out.println(m4);

        System.out.println("Matrix 1 * Matrix 2:");
        System.out.println(m5);

        System.out.println("Transpose of Matrix 1:");
        System.out.println(m6);

        sc.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
    }
}