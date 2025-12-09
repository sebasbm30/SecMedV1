public class Medico extends PersonalSanitario {

    private Especialidad especialidad;  //atributo propio de la clase Medico

    //Constructor de la clase Medico con atributos de la clase Medico, PersonalSanitario, Usuario y Persona
    public Medico(Especialidad especialidad,
                 String numeroColegiado,
                 String nombre, String dni, String email, String direccion,
                 String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado); //Llama al constructor de la clase PersonalSanitario
        this.especialidad = especialidad; // atributo de la clase Medico
    }
    //metodo Getters y Setters


    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    //metodo toString de la clase Medico
    @Override
    public String toString() {
        return "Medico{" +
                "especialidad=" + especialidad +               //atributo de la clase Medico
                ", numeroColegiado='" + numeroColegiado + '\'' + //atributo de la clase PersonalSanitario
                ", username='" + username + '\'' +               //atributo de la clase Usuario
                ", passwordHash='" + passwordHash + '\'' +               //atributo de la clase Usuario
                ", salt='" + salt + '\'' +                       // atributo de la clase Usuario
                ", nombre='" + nombre + '\'' +                   //atributo de la clase Persona
                ", dni='" + dni + '\'' +                     //atributo de la clase Persona
                ", email='" + email + '\'' +                     //atributo de la clase Persona
                ", direccion='" + direccion + '\'' +             //atributo de la clase Persona
                '}';
    }
}
