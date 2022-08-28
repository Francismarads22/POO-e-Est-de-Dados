import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double x1, y1, x2, y2;

		String[] entrada1 = scanner.nextLine().split(" ");
		String[] entrada2 = scanner.nextLine().split(" ");
		x1 = Double.parseDouble(entrada1[0]);
		y1 = Double.parseDouble(entrada1[1]);
		x2 = Double.parseDouble(entrada2[0]);
		y2 = Double.parseDouble(entrada2[1]);

		Double resultado = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

		System.out.printf("%.4f\n", resultado);

	}
}
