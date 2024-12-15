package desafio_conversao_temperaturas_java_alura;

public class ConversaoDeTemperaturas {
    public static void celsiusToFahrenheit() {
        double temperaturaEmCelsius = 15.01;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit",
                temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
