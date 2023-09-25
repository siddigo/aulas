package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
     
        Vetores();
        
    }

    static boolean Primo(int numero){

        if (numero<2) {
            return false;
        }

        for(int i=2;i<numero/2;i++){
            if (numero % i==0) {
                return false;
            }
        }
        return true;
    }

    static void PrintImpares(){
        
        int[] vetor = new int[10];

       for (int i=0;i<10;i++) {
           vetor[i]=i*2+1;
        }
        
        System.out.println("Vetor: ");



        for (int i=0;i<10;i++) {
            System.out.print(vetor[i]+" ");
        }
        
    }

    static void SomaPosicoes(){
        
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        lista.addAll(List.of(59,28,3,65,32));
        
        System.out.print("Digite o valor de x (0-4):");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y (0-4):");
        int y = scanner.nextInt();
        try {
            int soma=lista.get(x)+lista.get(y);
            System.out.println("Soma: "+soma);
        } catch (Exception e) {
            System.out.println("Posições Invalidas");
        }
        
        scanner.close();

        
    }

    static void Vetores(){

        int[] vetor1=new int[5];
        int[] vetor2=new int[5];
        int[] vetor3=new int[10];

        for (int i=0;i<5;i++){
            vetor1[i]=i * 2;
            vetor2[i]=vetor1[i]+1;
        }

        System.out.print("Vetor 1: ");
        for (int i : vetor1) {
            System.out.print(i+" "); 
        }

        System.out.print("Vetor 2: ");
        for (int i : vetor2) {
            System.out.print(i+" "); 
        }

        for( int i=0;i<5;i++){
            vetor3[i*2]=vetor1[i];
            vetor3[i*2+1]=vetor2[i];
        }

        System.out.print("Vetor 3: ");
        for (int i : vetor3) {
            System.out.print(i+" "); 
        }

    }

}