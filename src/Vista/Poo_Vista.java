package Vista;

import Modelo.Estudiante;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Poo_Vista {
    public static void main(String[] args) {
        // Listas (gestión simple sin clase "Colegio" para ir al grano)
        List<Profesor> profesores = new ArrayList<>();
        List<Estudiante> estudiantes = new ArrayList<>();

        // ==== Datos de ejemplo (puedes cambiarlos) ====
        profesores.add(new Profesor("10203040", "Matemáticas", 50000, 40,
                "Carlos Ruiz", "Cra 12 #45-10", "3123456789", "1978-05-10"));
        profesores.add(new Profesor("10204567", "Inglés", 45000, 38,
                "María Pérez", "Calle 20 #30-15", "3105678912", "1985-09-12"));
        profesores.add(new Profesor("10405060", "Historia", 40000, 42,
                "Andrés Gómez", "Av 5 #12-50", "3111234567", "1980-11-22"));

        estudiantes.add(new Estudiante(1001, "Lucía Torres", "Cra 15 #10-20", "3209876543", "2006-04-10"));
        estudiantes.add(new Estudiante(1002, "Jorge León", "Calle 9 #4-30", "3122223333", "2005-12-05"));
        estudiantes.add(new Estudiante(1003, "Paula Díaz", "Av 3 #7-45", "3103334444", "2007-08-15"));

        // ===== REPORTE 1: Estudiantes =====
        System.out.println("=== REPORTE DE ESTUDIANTES ===");
        for (Estudiante e : estudiantes) {
            // Puedes usar mostrarInfo() o toString()
            e.mostrarInfo();
        }
        System.out.println();

        // ===== REPORTE 2: Profesores ordenados por salario total (menor → mayor) =====
        System.out.println("=== REPORTE DE PROFESORES (POR SALARIO TOTAL) ===");
        profesores.sort(Comparator.comparingDouble(Profesor::calcularPago));

        double totalPrestaciones = 0.0;
        for (Profesor p : profesores) {
            double pago = p.calcularPago();            // (salHora*horas) * 1.20
            double prest = p.calcularPrestaciones();   // pago * 0.17
            totalPrestaciones += prest;

            System.out.printf(Locale.US,
                "%s | Área: %s | Cédula: %s | Salario total: %.2f | Prestaciones: %.2f%n",
                p.getNombre(), p.getArea(), p.getCedula(), pago, prest);
        }
        System.out.println("----------------------------------------------");
        System.out.printf(Locale.US, "TOTAL PRESTACIONES: %.2f%n", totalPrestaciones);
    }
}
