abstract class PersonalSanitario extends Usuario {   //Es una clase abstracta que extiende de Usuario

    //atributo de la clase PersonalSanitario
    protected String numeroColegiado;


    //constructor personalSanitario

    public PersonalSanitario(String nombre,String dni,String email,String direccion,
                             String username,String passwordHash, String salt,
                             String numeroColegiado){
        super(nombre,dni,email,direccion,username,passwordHash,salt); //metodos de usuario y persona
        this.numeroColegiado=numeroColegiado;
    }

    //Creamos sus Getters y Setters

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    //Creamos el metodo Tosttring


    @Override
    public String toString() {
        return "PersonalSanitario{" +
                "numeroColegiado='" + numeroColegiado + '\'' +                   //clase PersonalSanitario
                ", username='" + username + '\'' +                               //clase Usuario
                ", passwordHash='" + passwordHash + '\'' +                       //clase Usuario
                ", salt='" + salt + '\'' +                                       //clase Usuario
                ", nombre='" + nombre + '\'' +                                   //clase madre Persona
                ", dni='" + dni + '\'' +                                         //clase madre Persona
                ", email='" + email + '\'' +                                     //clase madre Persona
                ", direccion='" + direccion + '\'' +                             //clase madre Persona
                '}';
    }
}
