package applications;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int soma=0, i, somaDois=0;
		Scanner sc = new Scanner(System.in);
		int [] A = new int[6];
		
		for(i=0; i<6; i++) {
			System.out.println("Digite os números do vetor: ");
			A[i] = sc.nextInt();
			soma = soma + A[i];
			System.out.println("A soma dos vetores é igual a: "+ soma);
		}
		somaDois = A[0] + A[1] + A[5];
		System.out.println("A soma dos vetores A[0] + A[1] + A[5] é igual a: "+ somaDois);

		System.out.println("Qual posição deseja modificar?");
		int n = sc.nextInt();
		System.out.println("Entre com o valor que vai ficar na posição "+ n);
		int valor = sc.nextInt();
		A[n] = valor;
		
		System.out.println("\n Na posição 0, temos o valor: "+A[0]);
		System.out.println("\n Na posição 1, temos o valor: "+A[1]);
		System.out.println("\n Na posição 2, temos o valor: "+A[2]);
		System.out.println("\n Na posição 3, temos o valor: "+A[3]);
		System.out.println("\n Na posição 4, temos o valor: "+A[4]);
		System.out.println("\n Na posição 5, temos o valor: "+A[5]);
		
		sc.close();
	}
}


