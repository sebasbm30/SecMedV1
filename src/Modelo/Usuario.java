package Modelo;

/**
 * Clase Usuario.
 * Extiende de la clase modelo.Persona.
 */
public class Usuario extends Persona {     //Extiende de la clase modelo.Persona

    //Constructor de la clase modelo.Usuario
    protected String username;
    protected String passwordHash;
    protected String salt;

    //Constructor de la clase modelo.Usuario con atributos de la clase modelo.Usuario y de la clase modelo.Persona

    /**
     * Constructor de la clase Usuario.
     *
     * @param username nombre de usuario
     * @param passwordHash contraseña cifrada
     * @param salt valor salt para la contraseña
     * @param nombre nombre de la persona
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección
     */
    public Usuario(String username, String passwordHash, String salt,
                   String nombre, String dni, String email, String direccion) {

        super(nombre, dni, email, direccion); //Llama al constructor de la clase modelo.Persona con super
        this.username = username;                   //luego tenemos los atributos propios de la clase modelo.Usuario
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    //metodo Getters y Setters

    /**
     * Devuelve el nombre de usuario.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Asigna el nombre de usuario.
     *
     * @param username nuevo nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Devuelve la contraseña cifrada.
     *
     * @return password hash
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Asigna la contraseña cifrada.
     *
     * @param passwordHash nueva contraseña cifrada
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Devuelve el valor salt de la contraseña.
     *
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Asigna el valor salt de la contraseña.
     *
     * @param salt nuevo salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    //metodo toString de la clase modelo.Usuario

    /**
     * Devuelve una representación en texto del usuario.
     *
     * @return información del usuario
     */
    @Override
    public String toString() {
        return "modelo.Usuario{" +
                "username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +                          //atributos de la clase modelo.Usuario
                ", nombre='" + nombre + '\'' +                      //atributos de la clase modelo.Persona
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
