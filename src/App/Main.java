package App;

import Controlador.Controlador;

/**
 * Clase Main
 * Punto de entrada del programa
 */
public class Main {

    /**
     * Método main
     * Crea el controlador e inicia el programa
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}