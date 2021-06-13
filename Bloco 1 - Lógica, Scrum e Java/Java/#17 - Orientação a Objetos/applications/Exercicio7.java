package applications;

import java.util.Scanner;

import entities.Paciente;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Paciente paciente = new Paciente(null,null,null);
		
		System.out.println("Nome do paciente: ");
		paciente.nome = sc.nextLine();
		System.out.println("Nome: "+paciente.nome);
		
		System.out.println("Digite a idade do paciente: ");
		paciente.idade = sc.nextInt();
		System.out.println("A idade do paciente é: "+paciente.idade);
		
		System.out.println("Digite o CPF: ");
		paciente.cpf = sc.nextInt();
		System.out.println("CPF: "+paciente.cpf);
		
		sc.close();
		
	}
		
}
