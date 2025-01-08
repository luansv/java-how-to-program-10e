package javabook.chapter03.exercise3_11.domain;

public class Account {

    private String name; //variável de instância
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0) //se o saldo ofr válido
        this.balance = balance;  // o atribui à variável de instância balance
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if(depositAmount > 0.0 ) // se o despositAmount for válido
            balance = balance + depositAmount; //adiciona ao saldo
    }

    public double withdraw(double withdrawAmount){
        if (balance > withdrawAmount){
            balance -= withdrawAmount;
            return balance;
        }
        System.out.println("Withdrawal amount exceeded account balance");
        return balance;
    }

    //método retorna o saldo da conta
    public double getBalance(){
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
