package Modelo;


public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    public Persona() { }

    public Persona(String nombre, String direccion, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    // Puedes sobrescribir este método en las subclases
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
    }

    @Override
    public String toString() {
        return "Persona{nombre=" + nombre + ", direccion=" + direccion +
               ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + "}";
    }
}
