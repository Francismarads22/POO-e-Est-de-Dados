import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {

		String nome;
		double salario, vendas, calculo;

		Scanner leitor = new Scanner(System.in);
		nome = leitor.nextLine();
		salario = leitor.nextDouble();
		vendas = leitor.nextDouble();
		calculo = salario + (vendas * 0.15);
		System.out.printf("TOTAL  = R$ %.2f\n", calculo);

	}
}
