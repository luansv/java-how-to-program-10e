package notes;

import javax.swing.*;
import java.util.Scanner;

public class Addition {
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        String number1 = JOptionPane.showInputDialog("Valor 1: ");
        String number2 = JOptionPane.showInputDialog("Valor 2: ");

        try {
            //it makes a String turns into an int
            int intNumber1 = Integer.parseInt(number1);
            int intNumber2 = Integer.parseInt(number2);
            int sum = intNumber1 + intNumber2;
            String message = String.format("A soma de " + intNumber1 + " com " + intNumber2 + " é igual a: " + sum);
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números inteiros.");
            //the "null" makes the text appear in the center of the screen!
        }


    } // fim do método main
} // fim da classe Addition

