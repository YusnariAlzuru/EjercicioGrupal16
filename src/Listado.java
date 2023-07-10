import java.util.ArrayList;
import java.util.List;

public class Listado implements Asesoria {
    List<Asesoria> lista = new ArrayList<>();

    public void addUsuario(Asesoria usuario){
        this.lista.add(usuario);
    }

    @Override
    public void analizarUsuario() {
        for (Asesoria usuario: lista) {
            usuario.analizarUsuario();
        }
    }
}