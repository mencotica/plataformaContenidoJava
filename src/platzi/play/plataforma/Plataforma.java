package platzi.play.plataforma;

import platzi.play.contenido.Live;

import java.util.List;

public class Plataforma {

    private String nombre;
    private List <Live> contenido;

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    public void agregar (Live elemento) {
        this.contenido.add(elemento);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Live> getContenido() {
        return contenido;
    }

}
