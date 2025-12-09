package Modelo;

import java.time.LocalDate;
import java.util.List;

public class Receta extends EntradaHistorial {
    private List<String>medicamentos;      //cramos una lista para los medicamentos,

    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha,idMedico,causa);  //llamamos al constructor de la clase padre EntradaHistorial
        this.medicamentos = medicamentos;   //inicializamos la lista de medicamentos
    }

    //getter de la lista de medicamentos
    public List<String> getMedicamentos() {
        return medicamentos;
    }

    //metodo abstracto implementado de la clase padre EntradaHistorial
    @Override
    public String getTipo() {
        return "Receta";
    }

    //metodo toString de la clase Receta
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
