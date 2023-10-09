package oop;

public class Main {
    
    public static void main(String[] args) {
        
        NotaFiscal notaFiscal = new NotaFiscal(1,1);

        notaFiscal.addItem("001", "Coca-Cola Lt", 2, 5.00);
        notaFiscal.addItem("005", "Coxinha", 1, 8.00);
        notaFiscal.addItem("012", "Pão de batata", 1, 8.00);

        System.out.println(notaFiscal);
    }
}
