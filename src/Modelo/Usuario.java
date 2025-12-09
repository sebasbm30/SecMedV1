package Modelo;

public class Usuario extends Persona {     //Extiende de la clase modelo.Persona

    //Constructor de la clase modelo.Usuario
    protected String username;
    protected String passwordHash;
    protected String salt;


    //Constructor de la clase modelo.Usuario con atributos de la clase modelo.Usuario y de la clase modelo.Persona
    public Usuario(String username, String passwordHash, String salt
    , String nombre, String dni, String email, String direccion) {


        super(nombre,dni,email,direccion); //Llama al constructor de la clase modelo.Persona con super
        this.username = username;                   //luego tenemos los atributos propios de la clase modelo.Usuario
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    //metodo Getters y Setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    //metodo toString de la clase modelo.Usuario
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
