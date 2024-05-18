package Conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {

		// TODO: conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in);

		Double saldo = 1.522;

		// Exibir as mensagens para o nosso usuáro
		System.out.println("Digite o Numero da sua conta,  e tecle ENTER: ");
		int numero = scanner.nextInt();

		System.out.println("Digite o Numero da sua Agencia,  e tecle ENTER: ");
		String agencia = scanner.next();

		System.out.println("Digite o Nome do Cliente, e tecle ENTER: ");
		String nomeCliente = scanner.next();

		System.out.println("");

		// Obter pela classe scanner os valores digitados no terminal
		System.out.println("Numero da conta: " + numero + "\nAgencia Numero: " + agencia + "\nCliente: " + nomeCliente);

		System.out.println("");

		// Exibir a mensagem da conta criada
		System.out.println("Conta Revisada Com Sucesso! \nSEJA BEM-VINDO " + nomeCliente + "\nSeu Saldo é de: " + saldo + "R$");

	}

}
