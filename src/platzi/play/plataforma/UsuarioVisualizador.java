package platzi.play.plataforma;

import platzi.play.contenido.Live;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioVisualizador {

    public String nombre;
    public String email;
    public LocalDateTime fechaRegistro;

    public void ver (Live live) {
        System.out.println(this.nombre + " está viendo ..." );
        live.reproducir();
    }

}
