package applications;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.
		 */
		
		int somapar=0, somaimpar=0;

		Scanner sc = new Scanner(System.in);
		int[]vect = new int[6];
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite um n�mero: ");
			vect[i] = sc.nextInt();
			if(vect[i]%2==0) {
				somapar = somapar + vect[i];
			}else {
				somaimpar = somaimpar + vect[i];
			}
		}
		//System.out.println("Os numeros pares s�o: "+vect[i]);
		//System.out.println("Os numeros impares s�o: "+vect[i]);
		//como mostrar todos o vetor? como mostrar toda a matriz?
		
		System.out.println("A soma dos pares �: "+somapar);
		System.out.println("A soma dos impares �: "+somaimpar);
		
		sc.close();

	}

}
