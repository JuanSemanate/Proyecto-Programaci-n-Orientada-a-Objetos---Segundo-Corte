package tests;

import Modelo.Profesor;
import static org.junit.Assert.*;
import org.junit.Test;

public class ProfesorTest {

    // Test unitario: verifica el cálculo del pago mensual con el 20%
    @Test
    public void testCalcularPagoMensual() {
        Profesor p = new Profesor("123", "Matemáticas", 50000, 40,
                "Ana López", "Cra 10", "3000000000", "1980-01-01");
        double esperado = (50000 * 40) * 1.20; // = 2,400,000
        assertEquals(esperado, p.calcularPago(), 0.001);
    }

    // Test unitario: verifica el cálculo del 17% de prestaciones
    @Test
    public void testCalcularPrestaciones() {
        Profesor p = new Profesor("123", "Matemáticas", 50000, 40,
                "Ana López", "Cra 10", "3000000000", "1980-01-01");
        double esperado = ((50000 * 40) * 1.20) * 0.17; // 408,000
        assertEquals(esperado, p.calcularPrestaciones(), 0.001);
    }

    // Test de integración: verifica que los cálculos sean positivos
    @Test
    public void testIntegracionProfesoresBasica() {
        Profesor p1 = new Profesor("123", "Matemáticas", 50000, 40, "Ana", "Dir", "Tel", "1980-01-01");
        Profesor p2 = new Profesor("456", "Física", 40000, 30, "Luis", "Dir", "Tel", "1982-03-12");
        assertTrue(p1.calcularPago() > 0);
        assertTrue(p2.calcularPrestaciones() > 0);
    }
}

