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
        Medico m = new Medico(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado, especialidad); //creamos un nuevo medico
        medicos.add(m);
        vista.mostrarMensaje("Medico: " + nombre);
        vista.mostrarMedico(m); //mostramos un mensaje de que el medico se ha creado correctamente
    }

    //metodo que tiene la funcion de crear un administrativo
    public void crearAdministrativo(String nombre, String dni, String email, String direccion,
                                    String username, String passwordHash, String salt, String idAdministrativo) {
        Administrativo a = new Administrativo(nombre, dni, email, direccion, username, passwordHash, salt, idAdministrativo); //creamos un nuevo administrativo
        administrativos.add(a);
        vista.mostrarMensaje("Administrativo creado ");
        vista.mostrarAdministrativo(a); //mostramos un mensaje de que el administrativo se ha creado correctamente
    }

    //metodo para obtener un paciente por su indice
    public Paciente getPaciente(int indice) {
        if (indice >= 0 && indice < pacientes.size()) {    //verificamos que el indice sea valido
            return pacientes.get(indice);           //retun, devolvemos el paciente en la posicion del indice
        }
        return null;     //en caso de que el indice no sea valido devolvemos null
    }

    //metodo para obtener un medico por su indice
    public Medico getMedico(int indice) {
        if (indice >= 0 && indice < medicos.size()) {    //verificamos que el indice sea valido
            return medicos.get(indice);           //retun, devolvemos el medico en la posicion del indice
        }
        return null;     //en caso de que el indice no sea valido devolvemos null
    }

    //metodo para obtener un administrativo por su indice
    public Administrativo getAdministrativo(int indice) {
        if (indice >= 0 && indice < administrativos.size()) {    //verificamos que el indice sea valido
            return administrativos.get(indice);           //retun, devolvemos el administrativo en la posicion del indice
        }
        return null;     //en caso de que el indice no sea valido devolvemos null
    }

    //metodo para saber la lista de pacientes
    public void ListarPacientes(){
        if(pacientes.isEmpty()){   //si la lista de pacientes esta vacia
            vista.mostrarMensaje("No aparecen pacientes registrados.");   //mostramos un mensaje de que no hay pacientes registrados
        } else {      //si hay pacientes registrados
            vista.mostrarMensaje("Lista de Pacientes:"); //mostramos un mensaje de que hay pacientes registrados
            for (Paciente p : pacientes) {  //recorremos la lista de pacientes medieante un for each
                vista.mostrarPaciente(p); //mostramos el paciente
            }
        }
    }

    //metodo para saber la lista de medicos
    public void ListarMedicos() {
        if (medicos.isEmpty()) {   //si la lista de medicos esta vacia
            vista.mostrarMensaje("No aparecen medicos registrados.");   //mostramos un mensaje de que no hay medicos registrados
        } else {      //si hay medicos registrados
            vista.mostrarMensaje("Lista de Medicos:"); // mostramos un mensaje de que hay medicos registrados
            for (Medico m : medicos) {  //recorremos la lista de medicos medieante un for each
                vista.mostrarMedico(m); //mostramos los medicos
            }
        }
    }




}