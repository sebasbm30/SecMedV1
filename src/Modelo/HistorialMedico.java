package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase HistorialMedico.
 * Representa el historial médico de un paciente.
 */
public class HistorialMedico {

    private List<EntradaHistorial> entradas;    //esto seria una lista de entradas del historial medico

    //constructor

    /**
     * Constructor de la clase HistorialMedico.
     * Inicializa la lista de entradas del historial médico.
     */
    public HistorialMedico() {
        this.entradas = new ArrayList<>();  //lista vacia donde se iran añadiendo las entradas del historial medico
    }

    //Getters y Setters

    /**
     * Devuelve la lista de entradas del historial médico.
     *
     * @return lista de entradas
     */
    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    /**
     * Asigna la lista de entradas del historial médico.
     *
     * @param entradas nueva lista de entradas
     */
    public void setEntradas(List<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }

    //metodo para agregar una entrada al historial medico

    /**
     * Agrega una entrada al historial médico.
     *
     * @param entrada entrada del historial
     */
    public void agregarEntrada(EntradaHistorial entrada) {
        this.entradas.add(entrada);
        System.out.println("La entrada ha sido creada");
    }

    //metodo toString

    /**
     * Devuelve una representación en texto del historial médico.
     *
     * @return información del historial médico
     */
    @Override
    public String toString() {
        return "HistorialMedico{" +
                "entradas=" + entradas +
                '}';
    }
}
