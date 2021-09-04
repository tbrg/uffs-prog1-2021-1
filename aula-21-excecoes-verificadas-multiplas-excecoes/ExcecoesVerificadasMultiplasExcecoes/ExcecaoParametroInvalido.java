// Esta classe demonstra que novas classes de excecao criadas podem formar uma
// hierarquia de heranca
//
//                     Exception
//                         /\
//                         |
//                         |
//              ExcecaoParametroInvalido
//                         /\
//                         /\
//                        /  \
//        ExcecaoArrayNull    ExcecaoArrayTamanhoZero

class ExcecaoParametroInvalido extends Exception {
    public ExcecaoParametroInvalido() {
    }

    public ExcecaoParametroInvalido(String message) {
        super(message);
    }
}

