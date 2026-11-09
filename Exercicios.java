public class Exercicios {

    // Exercício 1: função sem retorno e sem parâmetros
    public static void imprimirSaudacao() {
        System.out.println("Bem-vindo ao sistema!");
    }

    // Exercício 2: soma de dois inteiros
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exercício 3: dobro de um número
    public static int dobrar(int numero) {
        return numero * 2;
    }

    // Exercício 4: Celsius -> Fahrenheit (F = C * 1.8 + 32)
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // Exercício 5: média de três notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Exercício 6: verifica se o número é par
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    // Exercício 7: maior de três números
    public static int maiorNumero(int a, int b, int c) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }

    // Exercício 8: fatorial (long para aguentar números maiores que 12)
    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // Exercício 9: potência (base ^ expoente) sem usar Math.pow
    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // Exercício 10: IMC = peso / (altura * altura)
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {

        System.out.println("=== Exercício 1 ===");
        imprimirSaudacao();

        System.out.println("\n=== Exercício 2 ===");
        System.out.println("8 + 5 = " + somar(8, 5));

        System.out.println("\n=== Exercício 3 ===");
        System.out.println("O dobro de 21 é " + dobrar(21));

        System.out.println("\n=== Exercício 4 ===");
        System.out.println("100 °C = " + converterCelsiusParaFahrenheit(100) + " °F");

        System.out.println("\n=== Exercício 5 ===");
        System.out.printf("Média das notas 7.5, 8.0 e 9.5: %.2f%n", calcularMedia(7.5, 8.0, 9.5));

        System.out.println("\n=== Exercício 6 ===");
        System.out.println("10 é par? " + verificarPar(10));
        System.out.println("7 é par? " + verificarPar(7));

        System.out.println("\n=== Exercício 7 ===");
        System.out.println("Maior entre 12, 45 e 30: " + maiorNumero(12, 45, 30));

        System.out.println("\n=== Exercício 8 ===");
        System.out.println("5! = " + calcularFatorial(5));

        System.out.println("\n=== Exercício 9 ===");
        System.out.println("2 elevado a 10 = " + calcularPotencia(2, 10));

        System.out.println("\n=== Exercício 10 ===");
        System.out.printf("IMC de 70 kg e 1.75 m: %.2f%n", calcularIMC(70, 1.75));
    }
}
