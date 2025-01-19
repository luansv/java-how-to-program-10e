package javabook.chapter04;

import java.util.Scanner;

public class exercise4_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar informações de cada empregado
        String nome;
        double horasTrabalhadas, salarioHora, salarioBruto;

        // Loop para processar cada empregado
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o nome do empregado " + i + ":");
            nome = scanner.nextLine();

            System.out.println("Digite o número de horas trabalhadas por " + nome + " na semana passada:");
            horasTrabalhadas = scanner.nextDouble();

            System.out.println("Digite o salário-hora de " + nome + ":");
            salarioHora = scanner.nextDouble();

            // Calcular o salário bruto com base nas horas trabalhadas
            salarioBruto = calcularSalarioBruto(horasTrabalhadas, salarioHora);

            // Exibir o salário bruto do empregado
            System.out.printf("O salário bruto de %s é R$ %.2f%n", nome, salarioBruto);

            // Limpar o buffer do scanner
            scanner.nextLine();
        }

        // Fechar o scanner
        scanner.close();
    }

    // Método para calcular o salário bruto com base nas horas trabalhadas e no salário-hora
    public static double calcularSalarioBruto(double horasTrabalhadas, double salarioHora) {
        double salarioBruto;

        if (horasTrabalhadas <= 40) {
            salarioBruto = horasTrabalhadas * salarioHora;
        } else {
            double horasExtras = horasTrabalhadas - 40;
            salarioBruto = (40 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }

        return salarioBruto;
    }
}

