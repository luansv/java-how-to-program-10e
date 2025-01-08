package javabook.chapter03.exercise3_12.test;
import javabook.chapter03.exercise3_12.domain.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Banana", "Comida", 14, 3.00);

        System.out.print(invoice1.getNome()+" "+invoice1.getDescricao()+" "+invoice1.getQuantidadeComprada()+" "+invoice1.getPrecoItem()+ " ");
        invoice1.getInvoiceAmount();

    }
}
