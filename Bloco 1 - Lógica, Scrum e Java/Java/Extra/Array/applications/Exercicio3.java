package applications;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//3- Leia uma matriz 3 x 3, 
		//conte e escreva quantos valores maiores que 10 ela possui.
		
		int somaNum=0;
		Scanner sc = new Scanner(System.in);
		int[][]mat = new int [3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0; j<3;j++) {
				System.out.println("Digite os valores da matriz: ");
				mat[i][j] = sc.nextInt();

				if(mat[i][j]>10) {
					somaNum = somaNum + 1;
					System.out.println("Existem "+somaNum +" números maiores que 10 nessa matriz");
				}
				
			}
		}
		
		sc.close();

	}

}
