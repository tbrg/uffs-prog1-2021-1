public class ExemploOperadores {
    public static void main(String[] args) {
        // Operador de concatenacao de strings
        String str1 = "abra";
        String str2 = "cadabra";

        str1 = str1 + str2;
        System.out.println(str1);

        // Operadores aritmeticos
        // +  -  *  /  %
        double d1 = 9.0;
        double d2 = 13.0;

        System.out.println(d1 - d2);

        // Operadores unarios
        // ++  --
        int a = 9;
        int b;

        // a++
        // O valor da expressao e calculado antes do incremento ocorrer
        // Em seguida, o incremento ocorre
        b = a++ + 10;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // ++a
        // O incremento ocorre primeiro
        // Em seguida, o valor da expressao e calculado
        b = ++a + 10;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Operadores relacionais
        // < > <= >= == !=
        d1 = 9.0;
        d2 = 13.0;

        System.out.println("d1 == d2 ? " + (d1 == d2));

        // Operadores logicos
        // && || ! ^
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 || b2 ? " + (b1 || b2));
        System.out.println("!b1 ? " + !b1);
    }
}

