public class Administrativo extends Usuario{
    private String area;
    private String experiencia_previa;

    public Administrativo(Integer run, String nombre, String fecha_nac, String area, String experiencia_previa) {
        super(run, nombre, fecha_nac);
        this.area = area;
        this.experiencia_previa = experiencia_previa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia_previa() {
        return experiencia_previa;
    }

    public void setExperiencia_previa(String experiencia_previa) {
        this.experiencia_previa = experiencia_previa;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia_previa='" + experiencia_previa + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        this.toString();
        System.out.println(this.toString());
    }
}
