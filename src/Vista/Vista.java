package Vista;

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
}
