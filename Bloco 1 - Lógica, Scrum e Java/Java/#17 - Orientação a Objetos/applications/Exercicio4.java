package applications;

import java.util.Scanner;

import entities.Funcionario;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario(null,null,null);
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.nome = sc.nextLine();
		System.out.println("O nome do funcionario: "+funcionario.nome);
		
		System.out.println("Digite o setor: ");
		funcionario.setor = sc.nextLine();
		System.out.println("O setor da(o) "+ funcionario.nome +" é: "+funcionario.setor);
		
		System.out.println("Digite o salario do funcionario: ");
		funcionario.salario = sc.nextDouble();
		System.out.println("O salário é: R$"+funcionario.salario);
		
		sc.close();
		
	}
		
}
