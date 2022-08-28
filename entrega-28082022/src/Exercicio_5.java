import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double MEDIA = (a * 3.5 + b * 7.5) / 11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
	}
}
