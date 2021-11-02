package exercicios.invoice;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice teste = new Invoice("1221","peca peca", 10,9.45);
        System.out.println(teste);
        System.out.print("Total da fatura: ");
        System.out.println(teste.getInvoiceAmount());


    }
}
