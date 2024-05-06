import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		String agencia, nomeCliente;
		double saldo;

		System.out.print("Digite seu nome: ");
		nomeCliente = scanner.nextLine();
		System.out.print("Digite seu numero da conta: ");
		numero = scanner.nextInt();
		System.out.print("Digite sua agência: ");
		agencia = scanner.next();
		System.out.print("Digite seu saldo: ");
		saldo = scanner.nextDouble();

		System.out.println("\n");

		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque!");
	}

}
