public class ExemploDecisaoRepeticao {
    public static void main(String[] args) {
        // If / else
        double d1 = 9.0;
        double d2 = 13.0;

        if (d1 < d2) {
            // Se a condicao for verdadeira
            System.out.println("d1 < d2");
        }
        else {
            // Se a condicao for falsa
            System.out.println("d1 >= d2");
        }

        // Switch
        int dia = 8; // numero que representa um dia da semana
        switch (dia) {
            // Se dia for 1
            case 1:
                System.out.println("Domingo");
                break;

            // Se dia for 2
            case 2:
                System.out.println("Segunda");
                // mais comandos
                break;

            // Casos 3, .., 6

            // Se dia for 7
            case 7:
                System.out.println("Sabado");
                // mais comandos
                break;

            // Valor invalido
            default:
                System.out.println("Valor invalido");
                // mais comandos
                break;
        }

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        // while
        System.out.println("Exemplo de while");
        int i = 10;
        while (i < 10) {
            System.out.println("i: " + i);
            i++;
        }

        // do-while
        System.out.println("Exemplo de do-while");
        i = 10;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 10);
    }
}

