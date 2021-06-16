public class ExemploArrays {
    public static void main(String[] args) {
        int a1;
        a1 = 20;

        // Declaracao de array
        int[] array1;

        // Criacao do array
        array1 = new int[a1]; // array1: [][][][][][][][][][][][][][][][][][][][]
                              //                 20 elementos (a1 == 20)

        // Como acessar o tamanho de um array?
        // nome_do_array.length

        // Atribuicao de valor ao primeiro elemento do array
        array1[0] = 13;

        // Atribuicao de valor a todos os elementos do array
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1[" + i + "]: " + array1[i]);
        }

        System.out.println();
        System.out.println("array1:");
        for (int el : array1) {
            System.out.println(el);
        }

        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 5) {
                break;
            }
            System.out.println("array1[" + i + "]: " + array1[i]);
        }

        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 5) {
                continue;
            }
            System.out.println("array1[" + i + "]: " + array1[i]);
        }
    }
}

