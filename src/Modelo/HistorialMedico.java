package Modelo;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {

    private List<EntradaHistorial> entradas;    //esto seria una lista de entradas del historial medico

    //constructor
    public HistorialMedico(){
        this.entradas=new ArrayList<>();  //lista vacia donde se iran añadiendo las entradas del historial medico
    }

    //Getters y Setters

    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }

    //metodo para agregar una entrada al historial medico
    public void agregarEntrada(EntradaHistorial entrada){
        this.entradas.add(entrada);
        System.out.println("La entrada ha sido creada");
    }

    //metodo toString
    @Override
    public String toString() {
        return "HistorialMedico{" +
                "entradas=" + entradas +
                '}';
    }
}
