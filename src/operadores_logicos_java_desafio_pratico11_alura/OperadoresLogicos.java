package operadores_logicos_java_desafio_pratico11_alura;

public class OperadoresLogicos {
    public static void operadorAnd(){
        // O operador AND (&&), que traduzindo para o português seria o E, é usado para verificar se duas condições são
        // verdadeiras. Se ambas as condições forem verdadeiras, o resultado será verdadeiro. Caso contrário, o resultado
        // será falso. Aqui está um exemplo:
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("A");
            // O código não será executado, já que 'a' é verdadeiro e 'b' é falso.
        }
    }
    public static void operadorOr(){
        //O operador OR (||), que traduzindo para o português seria o OU, é usado para verificar se pelo menos uma das
        // condições é verdadeira. Se pelo menos uma das condições for verdadeira, o resultado será verdadeiro.
        // Caso contrário, o resultado será falso. Aqui está um exemplo:
        boolean a = true;
        boolean b = false;
        if (a || b) {
            System.out.println("A");
            // O código será executado, já que a é verdadeiro, mesmo que 'b' seja falso.
        }
    }

    public static void operadorNot(){
        // O operador NOT (!) é usado para negar uma condição. Se a condição for verdadeira, o resultado será falso.
        // Se a condição for falsa, o resultado será verdadeiro. Aqui está um exemplo:
        boolean a = true;
        if (!a) {
            System.out.println("A");
            // Este código não será executado, já que a é verdadeiro.
        }

    }
}
