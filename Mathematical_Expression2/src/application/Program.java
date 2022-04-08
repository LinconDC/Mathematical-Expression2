package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// SOMA
		System.out.print("Insira 2 valores inteiros: ");

		int y = sc.nextInt();
		int x = sc.nextInt();
		int sum = x + y;

		System.out.print("A soma dos numeros é: " + sum);
		System.out.println();
		System.out.println();

		// ÁREA DO RAIO
		System.out.print("Insira o valor do raio de um círculo: ");

		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = raio * raio * pi;

		System.out.printf("A área do círculo é: %.4f%n", area);
		System.out.println();

		// CÁLCULOS DE VALORES
		System.out.print("Insira 4 valores inteiros:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int dif = a * b - c * d;

		System.out.print("Fórmula aplicada a * b - c * d : " + dif);
		System.out.println();
		System.out.println();

		// MÚLTIPLICAÇÃO
		System.out.println("Insira N° funcionário, Horas trabalhadas e valor por hora:");
		int num = sc.nextInt();
		int hour = sc.nextInt();
		double valueHour = sc.nextDouble();
		double bruteSalary = hour * valueHour;

		System.out.println("Número do funcionário: " + num);
		System.out.printf("Salário: R$ %.2f%n", bruteSalary);
		System.out.println();

		// MÚLTIPLICAÇÃO
		System.out.println("Insira o código da peça, a quantidade e o valor: ");

		int cod = sc.nextInt();
		int qte = sc.nextInt();
		double preco = sc.nextDouble();
		double total = qte * preco;

		System.out.printf("Código da peça: %d, Valor a pagar: R$ %.2f%n ", cod, total);

		sc.close();

	}

}
