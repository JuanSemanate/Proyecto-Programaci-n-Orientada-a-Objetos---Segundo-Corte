package Modelo;

public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioPorHora;
    private int horasDictadas;

    // Constructor principal (requerido)
    public Profesor(String cedula, String area, double salarioPorHora, int horasDictadas,
                    String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioPorHora = salarioPorHora;
        this.horasDictadas = horasDictadas;
    }

    // Sobrecarga (polimorfismo por sobrecarga): sin dirección/teléfono
    public Profesor(String cedula, String area, double salarioPorHora, int horasDictadas,
                    String nombre, String fechaNacimiento) {
        this(cedula, area, salarioPorHora, horasDictadas, nombre, "N/A", "N/A", fechaNacimiento);
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioPorHora() { return salarioPorHora; }
    public void setSalarioPorHora(double salarioPorHora) { this.salarioPorHora = salarioPorHora; }

    public int getHorasDictadas() { return horasDictadas; }
    public void setHorasDictadas(int horasDictadas) { this.horasDictadas = horasDictadas; }

    // Pago mensual = (salarioHora * horas) * 1.20
    public double calcularPago() {
        double pagoBase = salarioPorHora * horasDictadas;
        return pagoBase * 1.20; // incluye 20% por preparación
    }

    // Prestaciones = 17% del pago mensual
    public double calcularPrestaciones() {
        return calcularPago() * 0.17;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Profesor: " + getNombre() + " | Área: " + area +
                           " | Pago: " + calcularPago());
    }

    @Override
    public String toString() {
        return "Profesor{cedula=" + cedula + ", area=" + area +
               ", salarioPorHora=" + salarioPorHora + ", horasDictadas=" + horasDictadas + "} " +
               super.toString();
    }
}
