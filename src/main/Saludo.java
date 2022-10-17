package main;

public class Saludo extends Thread {
    // Hace falta sobreescribir el metodo run
    @Override
    public void run() {
        System.out.println("Saludo desde el hilo1!");
    }


}
