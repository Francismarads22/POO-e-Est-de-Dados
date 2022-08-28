import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int cod, cod2, quantidade, quantidade2;
		double precoUnitario, precoUnitario2, calculo;

		String[] entrada1 = leitor.nextLine().split(" ");
		cod = Integer.parseInt(entrada1[0]);
		quantidade = Integer.parseInt(entrada1[1]);
		precoUnitario = Double.parseDouble(entrada1[2]);

		String[] entrada2 = leitor.nextLine().split(" ");
		cod2 = Integer.parseInt(entrada2[0]);
		quantidade2 = Integer.parseInt(entrada2[1]);
		precoUnitario2 = Double.parseDouble(entrada2[2]);

		calculo = (quantidade * precoUnitario) + (quantidade2 * precoUnitario2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", calculo);

	}
}
