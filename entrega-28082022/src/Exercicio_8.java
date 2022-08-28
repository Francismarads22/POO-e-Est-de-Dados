import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		int mat, horasTrabalhadas;
		double calculoSalario, resultadoCalculo;

		Scanner leitor = new Scanner(System.in);
		mat = leitor.nextInt();
		horasTrabalhadas = leitor.nextInt();
		calculoSalario = leitor.nextDouble();
		resultadoCalculo = (horasTrabalhadas * calculoSalario);
		System.out.println("NUMBER  = " + mat);
		System.out.printf("SALARY  = %.2f\n", resultadoCalculo);

	}

}
