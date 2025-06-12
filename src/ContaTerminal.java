import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String agencia, nome, comando, depositar, sacar;
		int numero, valor, deposito, saque;
		double saldo;

		depositar = "depositar";
		sacar = "sacar";
		saldo = 0;

		System.out.println("Por favor, digite o n�mero da Ag�ncia!");
		agencia = sc.nextLine();

		System.out.println("Por favor, digite o n�mero da sua conta: ");
		numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Por favor, digite o seu nome: ");
		nome = sc.nextLine();

		System.out.println(nome + ", bem-vindo(a). O que voc� deseja fazer hoje?");
		System.out.println("depositar, sacar ou ver extrato?");
		comando = sc.nextLine();

		if (comando.equals(depositar)) {
			System.out.println("Qual valor ser� depositado?");
			deposito = sc.nextInt();
			saldo += deposito;
			System.out.println("Seu saldo total � de R$ " + saldo);
		}
		if (comando.equals(sacar)) {
			System.out.println("Qual valor ser� sacado?");
			saque = sc.nextInt();

			saldo -= saque;
			System.out.println("Seu saldo total � de R$ " + saldo);
		} else {
			System.out.println("Seu saldo total � de R$ " + saldo);
		}
		
		System.out.println(nome + ", obrigado por usar o nosso terminal. Sua ag�ncia " + agencia + ", conta " + numero + ", segue dispon�vel com o saldo de R$ " + saldo); 
		sc.close();
	}

}
