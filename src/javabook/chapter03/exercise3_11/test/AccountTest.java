package javabook.chapter03.exercise3_11.test;
import javabook.chapter03.exercise3_11.domain.Account;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 7.53);

        // Exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // Entrada de depósito para account1
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); // Obtém a entrada do usuário
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // Adiciona ao saldo de account1

        // Exibe os saldos
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // Entrada de depósito para account2
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // Obtém a entrada do usuário
        System.out.printf("Adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // Adiciona ao saldo de account2

        // Exibe os saldos
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        //Retirada
        System.out.println("Enter withdraw amount of account 1: ");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);


        // Exibir os saldos com a retirada
        System.out.println("Balace of "+account1.getName()+" with the withdraw: "+account1.getBalance());
        System.out.println("Balace of "+account2.getName()+" without the withdraw: "+account2.getBalance());

        // Retirada de account2
        System.out.print("Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        account2.withdraw(withdrawAmount);


        // Exibir os saldos com a retirada
        System.out.println("Balace of "+account1.getName()+" with the withdraw: "+account1.getBalance());
        System.out.printf("Balance of %s after withdrawal: $%.2f%n", account2.getName(), account2.getBalance());

        input.close();
    }
}
