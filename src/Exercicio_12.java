import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double a, b, c;

		String[] entrada = scanner.nextLine().split(" ");
		a = Double.parseDouble(entrada[0]);
		b = Double.parseDouble(entrada[1]);
		c = Double.parseDouble(entrada[2]);
		System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
		System.out.printf("CIRCULO: %.3f\n", (Math.PI * Math.pow(c, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f\n", (a * b));
	}
}
