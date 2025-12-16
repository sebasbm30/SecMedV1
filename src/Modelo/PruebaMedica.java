package Modelo;

import java.time.LocalDate;

/**
 * Clase PruebaMedica.
 * Representa una prueba médica realizada a un paciente.
 * Hereda de la clase EntradaHistorial.
 */
public class PruebaMedica extends EntradaHistorial {

    /**
     * Enumeración TipoPrueba.
     * Define los distintos tipos de pruebas médicas.
     */
    public enum TipoPrueba {
        SANGRE,
        ORINA,
        RADIODIAGNOSTICO,
        BIOPSIA,
        ELECTROCARDIOGRAMA,
        RESONANCIA,
        ANALISIS_SANGRE,
        TAC
    }

    private TipoPrueba tipoPrueba;
    private String resultado;

    /**
     * Constructor de la clase PruebaMedica.
     *
     * @param fecha fecha de la prueba
     * @param idMedico identificador del médico
     * @param causa causa de la prueba
     * @param tipoPrueba tipo de prueba médica
     * @param resultado resultado de la prueba
     */
    public PruebaMedica(LocalDate fecha, String idMedico, String causa,   //atributos de la clase que hereda EntradaHistorial
                        TipoPrueba tipoPrueba, String resultado) {        //atributos de la clase modelo

        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    // Getters solo pide eso

    /**
     * Devuelve el tipo de prueba médica.
     *
     * @return tipo de prueba
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    /**
     * Devuelve el resultado de la prueba médica.
     *
     * @return resultado
     */
    public String getResultado() {
        return resultado;
    }

    // metodo abstracto implementa TipoPrueba del Enum creado

    /**
     * Devuelve el tipo de entrada del historial.
     *
     * @return tipo de entrada
     */
    @Override
    public String getTipo() {
        return "PRUEBA";
    }

    //metodo ToString

    /**
     * Devuelve una representación en texto de la prueba médica.
     *
     * @return información de la prueba médica
     */
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
