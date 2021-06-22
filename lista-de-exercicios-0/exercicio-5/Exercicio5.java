// Faça um programa em Java que imprima na tela o seguinte:
// 1 Java atrapalha muita gente
// 2 Java atrapalham atrapalham muita gente
// 3 Java atrapalham atrapalham atrapalham muita gente
// 4 Java atrapalham atrapalham atrapalham atrapalham muita gente
// ...
// 100 Java atrapalham atrapalham ... atrapalham atrapalham muita gente

class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("1 Java atrapalha muita gente");
        for (int i = 2; i <= 100; i++) {
            System.out.print(i + " Java");
            for (int j = 1; j <= i; j++) {
                System.out.print(" atrapalham");
            }
            System.out.println(" muita gente");
        }
    }
}

