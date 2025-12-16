package Modelo;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase Receta.
 * Representa una receta médica registrada en el historial.
 * Hereda de la clase EntradaHistorial.
 */
public class Receta extends EntradaHistorial {

    private List<String> medicamentos;      //cramos una lista para los medicamentos,

    /**
     * Constructor de la clase Receta.
     *
     * @param fecha fecha de la receta
     * @param idMedico identificador del médico
     * @param causa causa de la receta
     * @param medicamentos lista de medicamentos
     */
    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);  //llamamos al constructor de la clase padre EntradaHistorial
        this.medicamentos = medicamentos;   //inicializamos la lista de medicamentos
    }

    //getter de la lista de medicamentos

    /**
     * Devuelve la lista de medicamentos de la receta.
     *
     * @return lista de medicamentos
     */
    public List<String> getMedicamentos() {
        return medicamentos;
    }

    //metodo abstracto implementado de la clase padre EntradaHistorial

    /**
     * Devuelve el tipo de entrada del historial.
     *
     * @return tipo de entrada
     */
    @Override
    public String getTipo() {
        return "Receta";
    }

    //metodo toString de la clase Receta

    /**
     * Devuelve una representación en texto de la receta.
     *
     * @return información de la receta
     */
    @Override
    public String toString() {
        return "Receta{" +
                "medicamentos=" + medicamentos +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}
