package operadores_relacionais_java_desafio_pratico11_alura;

public class OperadoresRelacionais {
    public static void exibirTextoInformativo() {
        System.out.println("\"==\" (igual a)\n" +
                "\"!=\" (diferente de)\n" +
                "\">\" (maior que)\n" +
                "\">=\" (maior ou igual a)\n" +
                "\"<\" (menor que)\n" +
                "\"<=\" (menor ou igual a)");
    }

    public static void testandoBooleanos(){
        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c

        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

    }
}
