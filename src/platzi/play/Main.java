package platzi.play;

import platzi.play.contenido.Live;
import platzi.play.plataforma.UsuarioVisualizador;
import platzi.play.util.ScanenerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String nombre = ScanenerUtils.capturarTexto("cual es el nombre");
        String genero = ScanenerUtils.capturarTexto("a que genero pertenece");
        double calificar = ScanenerUtils.capturarDecimal("que calificacion le das");
        int duracion = ScanenerUtils.capturarEntero("duracion del live");

        Live live = new Live();
        live.titulo = nombre;
        live.fechaEstreno = LocalDate.now();
        live.genero = genero;
        live.calificar(calificar);
        live.duracion = duracion;


        UsuarioVisualizador usuario = new UsuarioVisualizador();
        usuario.nombre = "santiago";
        usuario.fechaRegistro = LocalDateTime.now();
        usuario.ver(live);
        System.out.println(live.obtenerFichaTecnica());

    }
}