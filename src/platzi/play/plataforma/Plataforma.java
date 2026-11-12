package platzi.play.plataforma;

import platzi.play.contenido.Live;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    private String nombre;
    private List <Live> contenido;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    public void agregar (Live elemento) {
        this.contenido.add(elemento);
    }
    public void mostrarTitulos () {
        for (Live live : contenido) {
            System.out.println(live.getTitulo());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Live> getContenido() {
        return contenido;
    }

}
