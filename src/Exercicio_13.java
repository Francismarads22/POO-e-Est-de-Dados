import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, maiorAB, maiorBC;

		String[] entrada = scanner.nextLine().split(" ");
		a = Integer.parseInt(entrada[0]);
		b = Integer.parseInt(entrada[1]);
		c = Integer.parseInt(entrada[2]);
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		System.out.println(maiorBC + " eh o maior");

	}
}