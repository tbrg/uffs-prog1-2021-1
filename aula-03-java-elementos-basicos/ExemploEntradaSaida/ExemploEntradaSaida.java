import java.util.Scanner;

public class ExemploEntradaSaida {
    public static void main(String[] args) {
        int a1;
        a1 = 20;

        // Saida
        System.out.print("a1: " + a1);
        System.out.println("a1: " + a1);

        // Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        a1 = sc.nextInt();

        System.out.println("a1: " + a1);

        String str1;
        System.out.println("Digite uma string:");
        str1 = sc.nextLine(); // Consome o "Enter" que foi digitado apos o
                              // numero lido acima
        str1 = sc.nextLine(); // Le a string digitada

        System.out.println("str1: " + str1);

        System.out.println("Digite um double:");
        double d1 = sc.nextDouble();

        System.out.println("d1: " + d1);
    }
}

