package Modelo;

public class Estudiante extends Persona {
    private int codigo;

    public Estudiante(int codigo, String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + getNombre() + " | Código: " + codigo);
    }

    @Override
    public String toString() {
        return "Estudiante{codigo=" + codigo + "} " + super.toString();
    }
}
