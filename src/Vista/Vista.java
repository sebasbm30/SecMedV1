package Vista;

import Modelo.*;

public class Vista {

    //metodo para mostrar mensajes
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //muestra un titulo
    public void mostrarTitulo(String titulo) {
        System.out.println(titulo);
    }

    //menu principal donde pondremos los datos centrales
    public void mostrarMenu(){     //metodo para mostrar el menu principal
        mostrarTitulo("PROYECTO SEC MED V1.0");
        System.out.println("1, Crar paciente");
        System.out.println("2, Crear Medico");
        System.out.println("3, Crear Administrativo");
        System.out.println("4, asignar medico a paciente");
        System.out.println("5, Registrar prueba medica");
        System.out.println("6, Registrar receta");
        System.out.println("7, ver historial del paciente");
        System.out.println("8, Salir");
        System.out.println("Elige una opcion:");
    }
    //metodo para mostrar la informacion de las personas
    public void mostrarPersona(Persona p){
        System.out.println(" Datos de la persona  :");
        System.out.println("nombre: " + p.getNombre());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Email: " + p.getEmail());
        System.out.println("Direccion: " + p.getDireccion());
    }

    public void mostrarPaciente(Paciente p){
        mostrarTitulo(" Datos del paciente  :");
        System.out.println("nombre: " + p.getNombre());
        System.out.println("DNI: " + p.getDni());
        System.out.println("Email: " + p.getEmail());
        System.out.println("Direccion: " + p.getDireccion());

        //le decimos que si tiene medico asignado
        if(p.getMedicoAsignado()!=null){
            System.out.println("Medico: " + p.getMedicoAsignado().getNombre());
        } else { //si no tiene medico asignado
            System.out.println("NO TIENES MEDICO ASIGNADO");
        }
        System.out.println("Entradas  en historial" + p.getHistorial().getEntradas().size());
    }

    public void mostrarMedico(Medico m){
        mostrarTitulo(" Datos del medico  :");
        System.out.println("nombre: " + m.getNombre());
        System.out.println("DNI: " + m.getDni());
        System.out.println("Email: " + m.getEmail());
        System.out.println("Direccion: " + m.getDireccion());
        System.out.println("Especialidad: " + m.getEspecialidad());

    }

    public void mostrarAdministrativo(Administrativo a) {
        mostrarTitulo(" Datos del administrativo  :");
        System.out.println("nombre: " + a.getNombre());
        System.out.println("DNI: " + a.getDni());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Direccion: " + a.getDireccion());
    }

    public void mostrarHistorial(HistorialMedico historial) {
        mostrarTitulo("--- Historial Médico ---");

        if (historial.getEntradas().isEmpty()) {
            System.out.println("El historial está vacío");
        } else {
            System.out.println("Total de entradas: " + historial.getEntradas().size());
            System.out.println();

            for (EntradaHistorial entrada : historial.getEntradas()) {
                System.out.println("Tipo: " + entrada.getTipo());
                System.out.println("Fecha: " + entrada.getFecha());
                System.out.println("Médico: " + entrada.getIdMedico());
                System.out.println("Causa: " + entrada.getCausa());

                // Si es PruebaMedica
                if (entrada instanceof PruebaMedica) {
                    PruebaMedica prueba = (PruebaMedica) entrada;
                    System.out.println("Tipo de Prueba: " + prueba.getTipoPrueba());
                    System.out.println("Resultado: " + prueba.getResultado());
                }

                // Si es Receta
                if (entrada instanceof Receta) {
                    Receta receta = (Receta) entrada;
                    System.out.println("Medicamentos: " + receta.getMedicamentos());
                }

                System.out.println("---");
            }
        }
    }

}
