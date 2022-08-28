import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double raio, calculo;

		raio = leitor.nextDouble();
		calculo = (4 / 3.0) * Math.PI * Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f\n", calculo);
	}
}
