package App;

import Controlador.Controlador;
import Modelo.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        // Crear el controlador
        Controlador controlador = new Controlador();

        controlador.getVista().mostrarMensaje("Pueba trabajo sec med "+".............");

        // Crear un medico
        System.out.println(" " );
        controlador.getVista().mostrarMensaje("Creando medico...");
        controlador.crearMedico("Dr. House", "11111111H", "house@secmed.com", "Calle Falsa 123",
                "house", "hash123", "salt123", "MED-001", Especialidad.GENERAL);

        // Crear un administrativo
        System.out.println(" " );
        System.out.println("Creando Administrativo... " );
        controlador.crearAdministrativo("Admin Pepe", "33333333A", "pepe@secmed.com", "Oficina 1",
                "pepe", "hash789", "salt789", "ADM-001");

        // Crear un paciente
        System.out.println(" " );
        System.out.println("Crearpaciente.... " );
        controlador.crearPaciente("Juan Perez", "12345678Z", "juan@gmail.com", "Calle Real 10");

        // Asignar medico al paciente
        System.out.println(" " );

        controlador.getVista().mostrarMensaje("asignar edico al paciente...");
        controlador.asignarMedicoAPaciente(0, 0);

        // Registrar prueba medica
        System.out.println(" " );
        controlador.getVista().mostrarMensaje("Registrando prueba medica...");
        controlador.registrarPruebaMedia(0, LocalDate.now(), "MED-001",
                "Control rutinario", TipoPrueba.ANALISIS_SANGRE, "Colesterol alto");

        // Listar pacientes
        System.out.println(" " );
        controlador.getVista().mostrarMensaje("Lista de pacientes: ");
        controlador.listarPacientes();

        // Listar medicos
        System.out.println(" " );
        controlador.getVista().mostrarMensaje("lista de medicos: ");
        controlador.listarMedicos();

        // Mostrar historial del paciente
        System.out.println(" " );
        controlador.getVista().mostrarMensaje("Historial medico del paciente: ");
        controlador.mostrarHistorialMedico(0);

        System.out.println(" " );
        controlador.getVista().mostrarMensaje(".............Fin de la prueba de sec med.............");
    }
}