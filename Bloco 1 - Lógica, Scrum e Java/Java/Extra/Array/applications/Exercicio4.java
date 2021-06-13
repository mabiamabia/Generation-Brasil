package applications;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
		menu de op��es:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
		da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
		pr�pria matriz.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int opcao=0,mult=0,print=0,i=0,j=0;
		
		float[][]matA = new float[2][2];
		float[][]matB = new float[2][2];
		float[][]matC = new float[2][2]; //soma
		//float[][]matD = new float[2][2]; //subtra��o
		//float[][]matEa = new float[2][2]; //constante-multiplica��o A
		//float[][]matEb = new float[2][2]; //constante-multiplica��o B
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nDigite os valores da matriz A: ");
				matA[i][j] = sc.nextInt();
				System.out.println("\nDigite os valores da matriz B: ");
				matB[i][j] = sc.nextInt();	
			}
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nMatriz A: "+matA[i][j]);
				System.out.println("\nMatriz B: "+matB[i][j]);
			}
		}
		System.out.println("Digite o n�mero da opera��o que deseja: ");
		System.out.println("(1) somar as duas matrizes\r\n"
				+ "		(2) subtrair a primeira matriz da segunda\r\n"
				+ "		(3) adicionar uma constante as duas matrizes\r\n"
				+ "		(4) imprimir as matrizes");
		opcao = sc.nextInt();
		while(opcao<1 || opcao > 4) 
		{
			System.out.println("Digite o n�mero da opera��o que deseja: ");
			System.out.println("(1) somar as duas matrizes\r\n"
					+ "		(2) subtrair a primeira matriz da segunda\r\n"
					+ "		(3) adicionar uma constante as duas matrizes\r\n"
					+ "		(4) imprimir as matrizes");
			opcao = sc.nextInt();
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				if(opcao==1) {
					matC[i][j] = matA[i][j] + matB[i][j];
					System.out.println("soma das matrizes: "+ matC[i][j]);
				}else if(opcao==2) {
					matC[i][j] = matA[i][j] - matB[i][j];
					System.out.println("Subtra��o das matrizes: "+ matC[i][j]);
				}else if(opcao==3) {
					System.out.println("Qual o valor da constante que deseja adicionar?");
					mult = sc.nextInt();
					matC[i][j] = mult * matA[i][j];
					matC[i][j] = mult * matB[i][j];
					System.out.println("Constante: "+ mult);
					System.out.println("Resultado: "+ matC[i][j]);
					break;
				}else {
					System.out.println("Matriz A: "+matA[i][j]);
					System.out.println("Matriz B: "+matB[i][j]);
				}
			
		sc.close();

			}
		}
	}
}
