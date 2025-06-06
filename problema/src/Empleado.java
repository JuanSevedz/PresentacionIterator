import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String departamento;
    private LocalDate fechaIngreso;
    private boolean activo;

    public Empleado(String nombre, String departamento, LocalDate fechaIngreso, boolean activo) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return nombre + " | " + departamento + " | " + fechaIngreso + " | " + (activo ? "Activo" : "Inactivo");
    }
}
