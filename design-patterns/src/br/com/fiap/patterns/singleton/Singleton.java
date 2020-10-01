package br.com.fiap.patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
