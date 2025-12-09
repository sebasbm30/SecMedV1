package Modelo;

public class Paciente extends Persona {

  private HistorialMedico historial;  //asigancion de medico
  private Medico medicoAsigando;      // medico seleccionado que usaremos

    //Constructor

    public Paciente(String nombre,String dni,String email,String direccion){
        super(nombre, dni, email, direccion);  //atributos de la clase madre
        this.historial=new HistorialMedico();   //creamos un historial vacio
        this.medicoAsigando=null;               //Decimos que es null por que al principio no tendra
    }

    //Getters Y Setters


    public HistorialMedico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public Medico getMedicoAsigando() {
        return medicoAsigando;
    }

    public void setMedicoAsigando(Medico medicoAsigando) {
        this.medicoAsigando = medicoAsigando;
    }

    //metodo ToString


    @Override
    public String toString() {
        return "Paciente{" +
                "historial=" + historial +
                ", medicoAsigando=" + medicoAsigando +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
