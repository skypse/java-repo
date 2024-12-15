package concatenacao_strings_java_pratica_alura;

public class ConcatenacaoExemplos {
    public static void testandoString(){
        String nome = "Alura";

        // teste concat
        String saudacao = "Olá, ";
        String mensagem = saudacao + nome + "!";
        System.out.println(mensagem);
    }

    public static void comparandoString(){
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
