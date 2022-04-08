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

		System.out.print("A soma dos numeros �: " + sum);
		System.out.println();
		System.out.println();

		// �REA DO RAIO
		System.out.print("Insira o valor do raio de um c�rculo: ");

		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = raio * raio * pi;

		System.out.printf("A �rea do c�rculo �: %.4f%n", area);
		System.out.println();

		// C�LCULOS DE VALORES
		System.out.print("Insira 4 valores inteiros:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int dif = a * b - c * d;

		System.out.print("F�rmula aplicada a * b - c * d : " + dif);
		System.out.println();
		System.out.println();

		// M�LTIPLICA��O
		System.out.println("Insira N� funcion�rio, Horas trabalhadas e valor por hora:");
		int num = sc.nextInt();
		int hour = sc.nextInt();
		double valueHour = sc.nextDouble();
		double bruteSalary = hour * valueHour;

		System.out.println("N�mero do funcion�rio: " + num);
		System.out.printf("Sal�rio: R$ %.2f%n", bruteSalary);
		System.out.println();

		// M�LTIPLICA��O
		System.out.println("Insira o c�digo da pe�a, a quantidade e o valor: ");

		int cod = sc.nextInt();
		int qte = sc.nextInt();
		double preco = sc.nextDouble();
		double total = qte * preco;

		System.out.printf("C�digo da pe�a: %d, Valor a pagar: R$ %.2f%n ", cod, total);

		sc.close();

	}

}
