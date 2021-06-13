package applications;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre:
			• Os números pares digitados;
			• A soma dos números pares digitados;
			• Os números ímpares digitados;
			• A quantidade de números ímpares digitados.
		 */
		
		int somapar=0, somaimpar=0;

		Scanner sc = new Scanner(System.in);
		int[]vect = new int[6];
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
			if(vect[i]%2==0) {
				somapar = somapar + vect[i];
			}else {
				somaimpar = somaimpar + vect[i];
			}
		}
		//System.out.println("Os numeros pares são: "+vect[i]);
		//System.out.println("Os numeros impares são: "+vect[i]);
		//como mostrar todos o vetor? como mostrar toda a matriz?
		
		System.out.println("A soma dos pares é: "+somapar);
		System.out.println("A soma dos impares é: "+somaimpar);
		
		sc.close();

	}

}
