package Modelo;

/**
 * Clase Administrativo.
 * Representa un usuario administrativo del sistema.
 * Hereda de la clase Usuario.
 */
public class Administrativo extends Usuario {

    private String idAdministrativo;    //atributo propio de la clase modelo.Administrativo

    //Constructor de la clase modelo.Administrativo con atributos de la clase modelo.Administrativo, modelo.Usuario y modelo.Persona

    /**
     * Constructor de la clase Administrativo.
     *
     * @param idAdministrativo identificador del administrativo
     * @param username nombre de usuario
     * @param passwordHash contraseña cifrada
     * @param salt valor salt para la contraseña
     * @param nombre nombre de la persona
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección de la persona
     */
    public Administrativo(String idAdministrativo,
                          String username, String passwordHash, String salt,
                          String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion, username, passwordHash, salt); //Llama al constructor de la clase modelo.Usuario
        this.idAdministrativo = idAdministrativo; //luego tenemos el atributo propio de la clase modelo.Administrativo
    }

    //metodo Getters y Setters

    /**
     * Devuelve el identificador del administrativo.
     *
     * @return id del administrativo
     */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }

    /**
     * Asigna el identificador del administrativo.
     *
     * @param idAdministrativo nuevo identificador
     */
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    //metodo toString de la clase modelo.Administrativo

    /**
     * Devuelve una representación en texto del administrativo.
     *
     * @return información del administrativo
     */
    @Override
    public String toString() {
        return "modelo.Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +  //atributo de la clase modelo.Administrativo
                ", username='" + username + '\'' +                 //atributos de la clase modelo.Usuario
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", nombre='" + nombre + '\'' +                      //atributos de la clase modelo.Persona
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    //metodo asignar medico

    /**
     * Asigna un médico a un paciente.
     *
     * @param paciente paciente al que se le asigna el médico
     * @param medico médico asignado
     */
    public void asignarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
        System.out.println("modelo.Medico " + medico.getNombre() + " asignado al paciente " + paciente.getNombre());
    }

    //metodo para asignar una prueba a un paciente

    /**
     * Asigna una prueba médica a un paciente.
     *
     * @param paciente paciente al que se le asigna la prueba
     * @param prueba prueba médica
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica prueba) {
        paciente.getHistorial().agregarEntrada(prueba);
        System.out.println("Prueba medica para el paciente " + paciente.getNombre());
    }
}
