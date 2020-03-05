import java.util.Scanner;

class App {
    public static void main(String[] args) {
        // Criando o objeto
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);
        // Colocando valores nos atributos
        System.out.print("Digite um numero: ");
        calc.a = scan.nextInt();
        System.out.print("Digite outro numero: ");
        calc.b = scan.nextInt();
        // Executando o método soma
        calc.soma();
        // Executando o método multiplicacao
        int multi = calc.multiplicacao();
        System.out.println(multi);
        // Executando o método subtracao
        calc.subtracao(87, 43);
        // Executando o método divisao
        int divisao = calc.divisao(14, 7);
        System.out.println(divisao);
    }
}