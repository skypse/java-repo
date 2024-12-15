package casting_testando_java_pratica_alura;

public class TestandoCasting {
    public static void castingImplicito(){
        int x = 10;
        double y = x; // casting implicito
    }

    public static void castingExplicito(){
        double x = 10.5;
        int y = (int) x; // casting explícito
    }
}
