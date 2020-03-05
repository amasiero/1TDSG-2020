class Calculadora {
    int a;
    int b;

    void soma() {
        System.out.println(a + b);
    }

    int multiplicacao() { 
        return a * b;
    }

    void subtracao(int x, int y) {
        System.out.println(x - y);
    }

    int divisao(int numerador, int denominador) {
        return numerador / denominador;
    }
}