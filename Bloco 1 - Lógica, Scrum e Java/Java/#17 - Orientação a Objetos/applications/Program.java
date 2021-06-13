package applications;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		Cliente cliente = new Cliente(null, null, null);
		
		System.out.println("Entre com o nome de cliente: ");
		cliente.name = sc.nextLine();
		System.out.println("nome do cliente: "+ cliente.name);
		
		System.out.println("Entre com o telefone de cliente: ");
		cliente.telefone = sc.nextDouble();
		System.out.println("Telefone do cliente: "+ cliente.telefone);
		
		System.out.println("Entre com o cpf de cliente: ");
		cliente.cpf = sc.nextInt();
		System.out.println("cpf do cliente: "+ cliente.cpf);
		
		
		sc.close();
		
		
		

	}

}
