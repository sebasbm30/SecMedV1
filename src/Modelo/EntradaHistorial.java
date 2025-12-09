package Modelo;

import java.time.LocalDate;

//Abstract por que PruebaMedica y ConsultaMedica van a heredar de esta clase
abstract class EntradaHistorial {
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;


    //construtor EntradaHistorial
    public EntradaHistorial(LocalDate fecha,String idMedico,String causa){
        this.fecha=fecha;
        this.idMedico=idMedico;
        this.causa=causa;
    }


    //getters y setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

}
