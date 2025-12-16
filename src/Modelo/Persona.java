package Modelo;

/**
 * Clase Persona.
 * Representa a una persona del sistema.
 */
public class Persona {

    //atributos de la clase modelo.Persona
    protected String nombre;
    protected String dni;
    protected String email;
    protected String direccion;

    //constructor de la clase modelo.Persona

    /**
     * Constructor de la clase Persona.
     *
     * @param nombre nombre de la persona
     * @param dni documento nacional de identidad
     * @param email correo electrónico
     * @param direccion dirección
     */
    public Persona(String nombre, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }

    //Getters y Setters

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre de la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el DNI de la persona.
     *
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Asigna el DNI de la persona.
     *
     * @param dni nuevo dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve la dirección de la persona.
     *
     * @return dirección
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Asigna la dirección de la persona.
     *
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el email de la persona.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna el email de la persona.
     *
     * @param email nuevo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    //toString de la clase modelo.Persona

    /**
     * Devuelve una representación en texto de la persona.
     *
     * @return información de la persona
     */
    @Override
    public String toString() {
        return "modelo.Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
