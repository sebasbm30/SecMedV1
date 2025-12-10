package Controlador;

import Modelo.Administrativo;
import Modelo.Especialidad;
import Modelo.Medico;
import Modelo.Paciente;
import Vista.Vista;    //importamos la clase vista para poder usarla en el controlador esto me daba error si no lo ponia

import java.util.ArrayList;
import java.util.List;

public class Controlador {   //va hacer el intermediario entre la vista y el modelo

    private Vista vista;          //atributo vista para mostrar la informacion al usuario
    private List<Paciente> pacientes; //atributo lista de pacientes para almacenar pacientes
    private List<Medico> medicos;       //atributo lista de medicos para almacenar medicos
    private List<Administrativo> administrativos; //atributo lista de administrativos para almacenar administrativos

    //contructor del controlador
    public Controlador() {
        this.vista = new Vista();  //inicializamos la vista
        this.pacientes = new ArrayList<>(); //inicializamos la lista de pacientes
        this.medicos = new ArrayList<>();   //inicializamos la lista de medicos
        this.administrativos = new ArrayList<>(); //inicializamos la lista de administrativos
    }

    //metodo que tiene la funcion de agregar un paciente
    public void crearPaciente(String nombre, String dni, String email, String direccion) {
        Paciente p = new Paciente(nombre, dni, email, direccion); //creamos un nuevo paciente
        pacientes.add(p); //agregamos el paciente a la lista de pacientes
        vista.mostrarMensaje("Paciente creado correctamente"); //mostramos un mensaje de que el paciente se ha creado correctamente
    }

    //metodo que tiene la funcion de crear un medico
    public void crearMedico(String nombre, String dni, String email, String direccion,
                            String username, String passwordHash, String salt,
                            String numeroColegiado, Especialidad especialidad) {
        Medico m = new Medico(nombre, dni, email, direccion,username, passwordHash, salt, numeroColegiado,especialidad); //creamos un nuevo medico
        medicos.add(m);
        vista.mostrarMensaje("Medico: " +nombre);
        vista.mostrarMedico(m); //mostramos un mensaje de que el medico se ha creado correctamente
    }

    //metodo que tiene la funcion de crear un administrativo
    public void crearAdministrativo(String nombre,String dni,String email,String direccion,
                                    String username,String passwordHash,String salt,String idAdministrativo){
        Administrativo a = new Administrativo(nombre,dni,email,direccion,username,passwordHash,salt,idAdministrativo); //creamos un nuevo administrativo
        administrativos.add(a);
        vista.mostrarMensaje("Administrativo creado ");
        vista.mostrarAdministrativo(a); //mostramos un mensaje de que el administrativo se ha creado correctamente

    }

}