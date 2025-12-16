package Modelo;

/**
 * Clase Medico.
 * Representa a un médico del sistema.
 * Hereda de la clase PersonalSanitario.
 */
public class Medico extends PersonalSanitario {

    private Especialidad especialidad;  //atributo propio de la clase modelo.Medico

    //Constructor de la clase modelo.Medico con atributos de la clase modelo.Medico, modelo.PersonalSanitario, modelo.Usuario y modelo.Persona

    /**
     * Constructor de la clase Medico.
     *
     * @param nombre nombre del médico
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección
     * @param username nombre de usuario
     * @param passwordHash contraseña cifrada
     * @param salt valor salt para la contraseña
     * @param numeroColegiado número de colegiado
     * @param especialidad especialidad médica
     */
    public Medico(String nombre, String dni, String email, String direccion,
                  String username, String passwordHash, String salt,
                  String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado); //Llama al constructor de la clase modelo.PersonalSanitario
        this.especialidad = especialidad; // atributo de la clase modelo.Medico
    }

    //metodo Getters y Setters

    /**
     * Devuelve la especialidad del médico.
     *
     * @return especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Asigna la especialidad del médico.
     *
     * @param especialidad nueva especialidad
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    //metodo toString de la clase modelo.Medico

    /**
     * Devuelve una representación en texto del médico.
     *
     * @return información del médico
     */
    @Override
    public String toString() {
        return "Medico{" +
                "especialidad=" + especialidad +               //atributo de la clase modelo.Medico
                ", numeroColegiado='" + numeroColegiado + '\'' + //atributo de la clase modelo.PersonalSanitario
                ", username='" + username + '\'' +               //atributo de la clase modelo.Usuario
                ", passwordHash='" + passwordHash + '\'' +       //atributo de la clase modelo.Usuario
                ", salt='" + salt + '\'' +                       // atributo de la clase modelo.Usuario
                ", nombre='" + nombre + '\'' +                   //atributo de la clase modelo.Persona
                ", dni='" + dni + '\'' +                         //atributo de la clase modelo.Persona
                ", email='" + email + '\'' +                     //atributo de la clase modelo.Persona
                ", direccion='" + direccion + '\'' +             //atributo de la clase modelo.Persona
                '}';
    }
}
