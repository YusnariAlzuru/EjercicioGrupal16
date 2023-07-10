public class Usuario implements Asesoria{
    private Integer run;
    private String nombre;
    private String fecha_nac;

    public Usuario(Integer run, String nombre, String fecha_nac) {
        this.run = run;
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "run=" + run +
                ", nombre='" + nombre + '\'' +
                ", fecha_nac='" + fecha_nac + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println(nombre);
    }
}