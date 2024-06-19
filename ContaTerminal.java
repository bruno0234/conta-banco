import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = sc.nextLine();
		System.out.print("Por favor, digite o número da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Por favor, digite o saldo: ");
		double saldo = sc.nextDouble();
		System.out.printf(
			"""
			Olá %s, obrigado por criar uma conta em nosso banco, \
			sua agência é %s, conta %d e seu saldo %f já está \
			disponível para saque.
			""",
			nome, agencia, conta, saldo
		);
	}
}
