public class Usuario extends Persona {     //Extiende de la clase Persona

    //Constructor de la clase Usuario
    protected String username;
    protected String passwordHash;
    protected String salt;


    //Constructor de la clase Usuario con atributos de la clase Usuario y de la clase Persona
    public Usuario(String username, String passwordHash, String salt
    , String nombre, String dni, String email, String direccion) {


        super(nombre,dni,email,direccion); //Llama al constructor de la clase Persona con super
        this.username = username;                   //luego tenemos los atributos propios de la clase Usuario
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

    //metodo toString de la clase Usuario
    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +                          //atributos de la clase Usuario
                ", nombre='" + nombre + '\'' +                      //atributos de la clase Persona
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
