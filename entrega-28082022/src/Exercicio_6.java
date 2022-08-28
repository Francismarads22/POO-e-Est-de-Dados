import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		double MEDIA = (a * 2 + b * 3 + c * 5) / 10;
		System.out.println("MEDIA = " + MEDIA);

	}
}
