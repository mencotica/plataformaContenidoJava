package platzi.play.plataforma;

import platzi.play.contenido.Live;
import java.time.LocalDateTime;

public class UsuarioVisualizador {

    private String nombre;
    private String apellido;
    private String email;
    private LocalDateTime fechaRegistro;


    public UsuarioVisualizador(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaRegistro = LocalDateTime.now();
    }

    public void ver (Live live) {
        System.out.println(this.nombre + " está viendo ..." );
        live.reproducir();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
