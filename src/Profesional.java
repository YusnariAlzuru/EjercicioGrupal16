public class Profesional extends Usuario{
    private String titulo;
    private String fecha_ingreso;

    public Profesional(Integer run, String nombre, String fecha_nac, String titulo, String fecha_ingreso) {
        super(run, nombre, fecha_nac);
        this.titulo = titulo;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fecha_ingreso='" + fecha_ingreso + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        this.toString();
        System.out.println(this.toString());
    }
}
