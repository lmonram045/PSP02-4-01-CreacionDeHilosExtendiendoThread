package main;

public class Main {
    public static void main(String args[]) {
        // Creamos un objeto Saludo (Saludo extiende de Thread, tiene sus mismos métodos)
        Saludo hilo1 = new Saludo();

        System.out.println("Creando un nuevo hilo desde el hilo principal (main).");
        hilo1.start();
    }

}
