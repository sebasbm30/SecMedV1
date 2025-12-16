package Modelo;

import java.time.LocalDate;

/**
 * Clase abstracta EntradaHistorial.
 * Abstract por que PruebaMedica y ConsultaMedica van a heredar de esta clase
 */
public abstract class EntradaHistorial {

    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    //construtor EntradaHistorial

    /**
     * Constructor de la clase EntradaHistorial.
     *
     * @param fecha fecha de la entrada
     * @param idMedico identificador del médico
     * @param causa causa de la entrada
     */
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }

    //getters y setters

    /**
     * Devuelve la fecha de la entrada.
     *
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Asigna la fecha de la entrada.
     *
     * @param fecha nueva fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el identificador del médico.
     *
     * @return id del médico
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * Asigna el identificador del médico.
     *
     * @param idMedico nuevo id del médico
     */
    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * Devuelve la causa de la entrada.
     *
     * @return causa
     */
    public String getCausa() {
        return causa;
    }

    /**
     * Asigna la causa de la entrada.
     *
     * @param causa nueva causa
     */
    public void setCausa(String causa) {
        this.causa = causa;
    }

    // Metodo abstracto que deben implementar las subclases
    //esto me daba error si no lo ponia public

    /**
     * Devuelve el tipo de entrada del historial.
     *
     * @return tipo de entrada
     */
    public abstract String getTipo();

}