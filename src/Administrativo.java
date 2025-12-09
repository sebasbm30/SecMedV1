public class Administrativo extends Usuario {
    private String idAdministrativo;    //atributo propio de la clase Administrativo

     //Constructor de la clase Administrativo con atributos de la clase Administrativo, Usuario y Persona

public Administrativo(String idAdministrativo,
                      String username, String passwordHash, String salt,
                      String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion, username, passwordHash, salt); //Llama al constructor de la clase Usuario
        this.idAdministrativo = idAdministrativo; //luego tenemos el atributo propio de la clase Administrativo
    }

    //metodo Getters y Setters

    public String getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    //metodo toString de la clase Administrativo
    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +  //atributo de la clase Administrativo
                ", username='" + username + '\'' +                 //atributos de la clase Usuario
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", nombre='" + nombre + '\'' +                      //atributos de la clase Persona
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    //metodo asignar medico

    public void asignarMedico(Paciente paciente,Medico medico){
        paciente.setMedicoAsignado(medico);
        System.out.println("Medico " + medico.getNombre() + " asignado al paciente " + paciente.getNombre());
    }

    //metodo para asignar una prueba a un paciente

    public void asignarPrueba (Paciente paciente,PruebaMedica prueba) {
        paciente.getHistorial().agregarEntrada(prueba);
        System.out.println("Prueba medica para el paciente " + paciente.getNombre());
    }
}
