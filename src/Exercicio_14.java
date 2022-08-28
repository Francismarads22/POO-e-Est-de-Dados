import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int distancia;
		double consumo, media;

		distancia = scanner.nextInt();
		consumo = scanner.nextDouble();
		media = distancia / consumo;
		System.out.printf("%.3f km/l \n", media);

	}
}
