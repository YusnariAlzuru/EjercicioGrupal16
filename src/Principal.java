public class Principal {
    public static void main(String[] args){
        Listado listado = new Listado();

        Usuario usuario1 = new Usuario(18116285,"Sebastian Parra","08-01-92");

        Cliente cliente1 = new Cliente(12095313, "Marco Parra", "26-09-68",12957859,"Floridor", "Flores",1234567, "ProVida", 1, "Los Asaltantes 666", "Buin", 48);

        Profesional profesional1 = new Profesional(17903483, "Fabián Pérez", "14-05-09", "Ingeniero Agrónomo", "14-03-2021");

        Administrativo administrativo1 = new Administrativo(18467289, "Héctor Komori", "08-03-1976", "Ingeniería", "Sí, tiene experiencia");

        listado.addUsuario(usuario1);
        listado.addUsuario(cliente1);
        listado.addUsuario(profesional1);
        listado.addUsuario(administrativo1);

        usuario1.analizarUsuario();
        cliente1.analizarUsuario();
        profesional1.analizarUsuario();
        administrativo1.analizarUsuario();

    }
}