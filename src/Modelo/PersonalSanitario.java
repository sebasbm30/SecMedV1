package Modelo;

abstract class PersonalSanitario extends Usuario {   //Es una clase abstracta que extiende de modelo.Usuario

    //atributo de la clase modelo.PersonalSanitario
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
