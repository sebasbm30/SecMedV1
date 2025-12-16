package Modelo;

/**
 * Clase Paciente.
 * Representa a un paciente del sistema.
 * Hereda de la clase Persona.
 */
public class Paciente extends Persona {

    private HistorialMedico historial;  //asigancion de medico
    private Medico medicoAsignado;      // medico seleccionado que usaremos

    //Constructor

    /**
     * Constructor de la clase Paciente.
     *
     * @param nombre nombre del paciente
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección
     */
    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);  //atributos de la clase madre
        this.historial = new HistorialMedico();   //creamos un historial vacio
        this.medicoAsignado = null;               //Decimos que es null por que al principio no tendra
    }

    //Getters Y Setters

    /**
     * Devuelve el historial médico del paciente.
     *
     * @return historial médico
     */
    public HistorialMedico getHistorial() {
        return historial;
    }

    /**
     * Asigna el historial médico del paciente.
     *
     * @param historial nuevo historial
     */
    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    /**
     * Devuelve el médico asignado al paciente.
     *
     * @return médico asignado
     */
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    /**
     * Asigna un médico al paciente.
     *
     * @param medicoAsignado médico asignado
     */
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    //metodo ToString

    /**
     * Devuelve una representación en texto del paciente.
     *
     * @return información del paciente
     */
    @Override
    public String toString() {
        return "Paciente{" +
                "historial=" + historial +
                ", medicoAsignado=" + medicoAsignado +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
