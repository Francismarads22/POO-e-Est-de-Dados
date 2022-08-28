import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		double raio, area;
		Scanner input = new Scanner(System.in);

		raio = input.nextDouble();
		area = 3.14159 * (raio * raio);
		System.out.printf("A = %.4f\n", area);

	}
}