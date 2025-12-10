package Modelo;

public class Paciente extends Persona {

  private HistorialMedico historial;  //asigancion de medico
  private Medico medicoAsignado;      // medico seleccionado que usaremos

    //Constructor

    public Paciente(String nombre,String dni,String email,String direccion){
        super(nombre, dni, email, direccion);  //atributos de la clase madre
        this.historial=new HistorialMedico();   //creamos un historial vacio
        this.medicoAsignado=null;               //Decimos que es null por que al principio no tendra
    }

    //Getters Y Setters


    public HistorialMedico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    //metodo ToString


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
