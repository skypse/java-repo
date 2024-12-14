import perfilJavaDesafioPratico11_Alura.Perfil;
import estudosJavaDesafioPratico11_Alura.Estudos;
import operacoesJavaDesafioPratico11_Alura.Operacoes;

public class Main {
    public static void main(String[] args) {
        // classe perfil
        Perfil saudacao = new Perfil();
        saudacao.saudacaoPerfil();

        // classe estudos
        Estudos estudos = new Estudos();
        estudos.anotacoesEstudos();
        System.out.println("------------------------------------------------------------");

        // classe operacoes
        System.out.println("Puxando a classe de operações para testar soma e subtração");
        System.out.println("Soma: " + Operacoes.somar(10, 5));         // soma: 10
        System.out.println("Subtração: " + Operacoes.subtrair(10, 5)); // subtração: 4
    }
}