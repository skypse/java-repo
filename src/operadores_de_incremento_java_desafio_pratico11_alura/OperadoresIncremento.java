package operadores_de_incremento_java_desafio_pratico11_alura;

public class OperadoresIncremento {
    // Além dos operadores citados anteriormente, o operador de incremento é usado para aumentar
    // o valor de uma variável em 1. Existem dois tipos de operadores de incremento: o operador de pré-incremento
    // (++variavel) e o operador de pós-incremento (variavel++).

    public static void preIncremento() {
        // O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável
        // em uma expressão. Aqui está um exemplo:
        System.out.println("Pré-incremento teste:");
        int numero = 5;
        int resultado = ++numero; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(numero); // imprime 6
        System.out.println(resultado); // imprime 6
    }
    public static void posIncremento(){
        // Já o operador de pós-incremento (variavel++) aumenta o valor da
        // em 1 depois de usar a variável em uma expressão. Aqui está um exemplo:
        System.out.println("Pós-incremento teste:");
        int numero = 5;
        int resultado = numero++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(numero); // imprime 6
        System.out.println(resultado); // imprime 5
    }
}
