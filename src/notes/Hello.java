package notes;

import javax.swing.*;

public class Hello {
    public static void main(String[] args) {

        // pede para o usuário inserir seu nome ÿ
          String name = JOptionPane.showInputDialog("What is your name?");

           // cria a mensagemÿ
           String message = String.format("Welcome, "+name+", to Java Programming!");

           // exibe a mensagem para cumprimentar o usuário pelo nomeÿ
           JOptionPane.showMessageDialog(null, message);
    }
}
