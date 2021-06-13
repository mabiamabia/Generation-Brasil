package applications;

import java.util.Scanner;

import entities.ContaBancaria;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contabancaria = new ContaBancaria(null,null,null);
		
		System.out.println("Digite o nome da proprietaria da conta: ");
		contabancaria.nome = sc.nextLine();
		System.out.println("A dona da conta é: "+contabancaria.nome);
		
		System.out.println("Digite o número da conta: ");
		contabancaria.conta = sc.nextInt();
		System.out.println("O número da conta é: "+contabancaria.conta);
		
		System.out.println("Digite o valor que deseja inserir na conta: ");
		contabancaria.valor = sc.nextDouble();
		System.out.println("Saldo: R$"+contabancaria.valor);
		
		sc.close();
		
	}
		
}
