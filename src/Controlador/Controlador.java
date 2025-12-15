package Controlador;

import Modelo.*;
import Vista.Vista;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase Controlador
 * Controla el flujo del programa
 */
public class Controlador {

    /**
     * Vista para mostrar mensajes
     */
    Vista vista = new Vista();

    /**
     * Método iniciar
     * Ejecuta todas las pruebas del sistema
     */
    public void iniciar() {
        vista.imprimir("Pruebas v1.0 - Version Simple");

        // Crear Usuarios
        Medico m1 = new Medico("Dr. Pedraza", "11111111H", "pedraza@secmed.com", "Calle Hospital 10",
                "drpedraza", "hash123", "salt123", "MED-001", Especialidad.CARDIOLOGIA);

        Administrativo admin1 = new Administrativo("Admin Sofia", "22222222A", "sofia@secmed.com", "Oficina 2",
                "sofia", "hash456", "salt456", "ADM-001");

        vista.imprimir("---Usuarios Creados---");
        vista.imprimir(m1.toString());
        vista.imprimir(admin1.toString());

        // Crear Paciente
        Paciente p1 = new Paciente("Maria Garcia", "33333333B", "maria@gmail.com", "Calle Mayor 5");
        vista.imprimir("---Paciente Creado---");
        vista.imprimir(p1.toString());

        // Asignar medico a paciente
        admin1.asignarMedico(p1, m1);
        vista.imprimir("---Medico Asignado---");
        vista.imprimir(p1.toString());

        // Pruebas de historial
        Receta r1 = new Receta(LocalDate.now().minusDays(2), m1.getNumeroColegiado(), "Hipertension",
                new ArrayList<>(Arrays.asList("Atenolol 50mg", "Agua")));

        PruebaMedica pm1 = new PruebaMedica(LocalDate.now().minusDays(2), m1.getNumeroColegiado(),
                "Chequeo general", PruebaMedica.TipoPrueba.ELECTROCARDIOGRAMA, "Normal");

        vista.imprimir("---Historial Medico---");
        p1.getHistorial().agregarEntrada(r1);
        admin1.asignarPrueba(p1, pm1);
        vista.imprimir(p1.getHistorial().toString());
    }
}