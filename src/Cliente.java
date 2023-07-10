import java.sql.SQLOutput;

public class Cliente extends Usuario{
    private Integer rut;
    private String nombres;
    private String apellidos;
    private Integer telefono;
    private String afp;
    private Integer sistema_salud;
    private String direccion;
    private String comuna;
    private Integer edad;

    public Cliente(Integer run, String nombre, String fecha_nac, Integer rut, String nombres, String apellidos, Integer telefono, String afp, Integer sistema_salud, String direccion, String comuna, Integer edad) {
        super(run, nombre, fecha_nac);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistema_salud = sistema_salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public Integer getSistema_salud() {
        return sistema_salud;
    }

    public void setSistema_salud(Integer sistema_salud) {
        this.sistema_salud = sistema_salud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistema_salud=" + sistema_salud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        this.toString();
        System.out.println(this.toString());
    }
}