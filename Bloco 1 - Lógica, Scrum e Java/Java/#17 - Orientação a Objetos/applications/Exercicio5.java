package applications;

import java.util.Scanner;

import entities.Patinete;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Patinete patinete = new Patinete(null,null,null);
		
		System.out.println("Digite a marca do patinete: ");
		patinete.marca = sc.nextLine();
		System.out.println("A marca do patinete �: "+patinete.marca);
		
		System.out.println("Digite o pre�o do patinete: ");
		patinete.preco = sc.nextDouble();
		System.out.println("O pre�o do patinete �: R$"+patinete.preco);
		
		System.out.println("Digite a quantidade em estoque: ");
		patinete.quantidade = sc.nextInt();
		System.out.println("Quantidade em estoque: "+patinete.quantidade);
		
		sc.close();
		
	}
		
}
