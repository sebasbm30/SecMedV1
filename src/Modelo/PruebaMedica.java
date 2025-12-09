package Modelo;

import java.time.LocalDate;

public class PruebaMedica extends EntradaHistorial {
    private TipoPrueba tipoPrueba;
    private String resultado;

    public PruebaMedica(LocalDate fecha, String idMedico, String causa,   //atributos de la clase que hereda EntradaHistorial
                        TipoPrueba tipoPrueba, String resultado) {        //atributos de la clase modelo

        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    // Getters solo pide eso

    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    public String getResultado() {
        return resultado;
    }

    // metodo abstracto implementa TipoPrueba del Enum creado

    @Override
    public String getTipo() {
        return "PRUEBA";
    }

    //metodo ToString

    @Override
    public String toString() {
        return "PruebaMedica{" +
                "tipoPrueba=" + tipoPrueba +
                ", resultado='" + resultado + '\'' +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}