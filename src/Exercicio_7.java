import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {

		int a, b, c, d, diferencaProduto;

		Scanner leitor = new Scanner(System.in);
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		d = leitor.nextInt();
		diferencaProduto = (a * b - c * d);
		System.out.println("DIFERENCA  = " + diferencaProduto);

	}
}
