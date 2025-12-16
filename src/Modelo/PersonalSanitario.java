package Modelo;

/**
 * Clase abstracta PersonalSanitario.
 * Es una clase abstracta que extiende de modelo.Usuario.
 */
abstract class PersonalSanitario extends Usuario {   //Es una clase abstracta que extiende de modelo.Usuario

    //atributo de la clase modelo.PersonalSanitario
    protected String numeroColegiado;

    //constructor personalSanitario

    /**
     * Constructor de la clase PersonalSanitario.
     *
     * @param nombre nombre del personal sanitario
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección
     * @param username nombre de usuario
     * @param passwordHash contraseña cifrada
     * @param salt valor salt para la contraseña
     * @param numeroColegiado número de colegiado
     */
    public PersonalSanitario(String nombre, String dni, String email, String direccion,
                             String username, String passwordHash, String salt,
                             String numeroColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt); //metodos de usuario y persona
        this.numeroColegiado = numeroColegiado;
    }

    //Creamos sus Getters y Setters

    /**
     * Devuelve el número de colegiado.
     *
     * @return número de colegiado
     */
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    /**
     * Asigna el número de colegiado.
     *
     * @param numeroColegiado nuevo número de colegiado
     */
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    //Creamos el metodo Tosttring

    /**
     * Devuelve una representación en texto del personal sanitario.
     *
     * @return información del personal sanitario
     */
    @Override
    public String toString() {
        return "modelo.PersonalSanitario{" +
                "numeroColegiado='" + numeroColegiado + '\'' +                   //clase modelo.PersonalSanitario
                ", username='" + username + '\'' +                               //clase modelo.Usuario
                ", passwordHash='" + passwordHash + '\'' +                       //clase modelo.Usuario
                ", salt='" + salt + '\'' +                                       //clase modelo.Usuario
                ", nombre='" + nombre + '\'' +                                   //clase madre modelo.Persona
                ", dni='" + dni + '\'' +                                         //clase madre modelo.Persona
                ", email='" + email + '\'' +                                     //clase madre modelo.Persona
                ", direccion='" + direccion + '\'' +                             //clase madre modelo.Persona
                '}';
    }
}
