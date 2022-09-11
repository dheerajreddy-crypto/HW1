import java.util.Random;
import java.util.Scanner;

public class MatrixIntegerNumber_1 {
	public static void main(String args[]) {
		
		int r1, r2,c1,c2,i,j,k,sum;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter the number of rows of matrix1");
		r1 = scan.nextInt();
	 
		System.out.println("Enter the number columns of matrix 1");
		c1 = scan.nextInt();
		System.out.println("Enter the number of rows of matrix2");
		r2 = scan.nextInt();
	 
		System.out.println("Enter the number of columns of matrix 2");
		c2 = scan.nextInt();
	 
		scan.close();
		
		long startTime = System.currentTimeMillis();
		
		if(c1==r2) {
	 
			int mat1[][] = new int[r1][c1]; 
			int mat2[][] = new int[r2][c2]; 
			int res[][] = new int[r1][c2];
	 
	          //elements of matrix 1
			for ( i= 0 ; i < c1 ; i++ ) { 
	 
				for ( j= 0 ; j < r1 ;j++ ) {
					mat1[j][i ] = rand.nextInt(100);
				}
	 
			}
			
	          //elements of matrix 2
			for ( i= 0 ; i < c2 ; i++ ) { 
	 
				for ( j= 0 ; j < r2 ;j++ ) {
					mat2[j][i] = rand.nextInt(100);
				}
	 
			}
			
	 
			System.out.println("\n\noutput matrix:-");
			for ( i= 0 ; i < c2 ; i++ ) {
	 
				for ( j= 0 ; j <r1;j++) {
					sum=0;
					for ( k= 0 ; k <r2;k++ ){
						sum +=mat1[j][k]*mat2[k][i] ;
					}
					res[j][i]=sum;
				}
			}
			for ( i= 0 ; i < r1; i++ ){
				for ( j=0 ; j < c2;j++ )
					System.out.print(res[i][j]+" ");
	 
				System.out.println();
			}
		}
		else {
			System.out.print("multipication does not exist ");
		}
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		System.out.println("Execution Time is " + executionTime + " ms");
		
	}
	 
}