package Modelo;

public class Medico extends PersonalSanitario {

    private Especialidad especialidad;  //atributo propio de la clase modelo.Medico

    //Constructor de la clase modelo.Medico con atributos de la clase modelo.Medico, modelo.PersonalSanitario, modelo.Usuario y modelo.Persona
    public Medico(Especialidad especialidad,
                 String numeroColegiado,
                 String nombre, String dni, String email, String direccion,
                 String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado); //Llama al constructor de la clase modelo.PersonalSanitario
        this.especialidad = especialidad; // atributo de la clase modelo.Medico
    }
    //metodo Getters y Setters


    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    //metodo toString de la clase modelo.Medico
    @Override
    public String toString() {
        return "modelo.Medico{" +
                "especialidad=" + especialidad +               //atributo de la clase modelo.Medico
                ", numeroColegiado='" + numeroColegiado + '\'' + //atributo de la clase modelo.PersonalSanitario
                ", username='" + username + '\'' +               //atributo de la clase modelo.Usuario
                ", passwordHash='" + passwordHash + '\'' +               //atributo de la clase modelo.Usuario
                ", salt='" + salt + '\'' +                       // atributo de la clase modelo.Usuario
                ", nombre='" + nombre + '\'' +                   //atributo de la clase modelo.Persona
                ", dni='" + dni + '\'' +                     //atributo de la clase modelo.Persona
                ", email='" + email + '\'' +                     //atributo de la clase modelo.Persona
                ", direccion='" + direccion + '\'' +             //atributo de la clase modelo.Persona
                '}';
    }
}
