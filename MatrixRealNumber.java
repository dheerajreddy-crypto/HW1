import java.util.*;

public class MatrixRealNumber{
	
	public static void main(String args[]){
		
		int r1, r2,c1,c2,i,j,k;
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
	
		if(c1==r2){
	 
			double mat1[][] = new double[r1][c1]; 
			double mat2[][] = new double[r2][c2]; 
			double res[][] = new double[r1][c2];
	 
	
			//elements of matrix 1 
			for ( i= 0 ; i < r1 ; i++ ){ 
	 
				for ( j= 0 ; j < c1 ;j++ )
					mat1[i][j] = (double)rand.nextDouble();
	 
			}
	
			//elements of matrix 2 
			for ( i= 0 ; i < r2 ; i++ ){ 
	 
				for ( j= 0 ; j < c2 ;j++ )
					mat2[i][j] =(double)rand.nextDouble();
	 
			}
			
			System.out.println("\n\noutput matrix:-");
			for ( i= 0 ; i < r1 ; i++ ) {
				
				for ( j= 0 ; j <c2;j++){
					double sum = 0.00;
					for ( k= 0 ; k <r2;k++ ){
					sum += mat1[i][k]*mat2[k][j] ;
	 
					}
					res[i][j]=(double)sum;
				}
			}
			for ( i= 0 ; i < r1; i++ ){
				for ( j=0 ; j < c2;j++ ) {
					System.out.print((double)res[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.print("multipication does not exist ");
		}
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution Time is " + executionTime + " ms.");
	}

	 
}