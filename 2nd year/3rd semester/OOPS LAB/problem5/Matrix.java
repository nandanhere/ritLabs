import java.util.*;
public class Matrix{
public static void main(String args[]){
	int r1, r2, c1, c2;
	System.out.println("Enter rows and cols of matrix 1 and 2");
	Scanner sc = new Scanner(System.in);
	r1 = sc.nextInt();
	c1 = sc.nextInt();
	r2 = sc.nextInt();
	c2 = sc.nextInt();
	int mat1[][] = new int[r1][c1];
	int mat2[][] = new int[r2][c2];
	System.out.println("Enter elements of matrix 1");
	for(int i = 0; i < r1; i++){
		for(int j = 0; j < c1; j++){
			mat1[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter elements of matrix 2");
	for(int i = 0; i < r2; i++){
		for(int j = 0; j < c2; j++){
			mat2[i][j] = sc.nextInt();
		}
	}
if (r2 != c1){
	System.out.println("Multiplication not possible");
sc.close();
	return;
}
int fin[][] = new int[r1][c2];
for(int i = 0; i < r1; i++){
	for(int j = 0; j < c2; j++){
		for(int k = 0; k < r2; k++){
		fin[i][j] += mat1[i][k] * mat2[k][j];
}
}

}
for(int i = 0; i < r1; i++){
	System.out.println("Row " + i + " is");
	for(int j = 0; j < c2; j++){
	System.out.print(fin[i][j] + " ");
	
}
System.out.println(" ");
}
sc.close();
}
}
