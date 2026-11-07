package platzi.play;

import platzi.play.contenido.Live;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.UsuarioVisualizador;
import platzi.play.util.ScanenerUtils;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);

        System.out.println(NOMBRE_PLATAFORMA + " v" + VERSION);

        String nombreLive = ScanenerUtils.capturarTexto("cual es el nombre del Live");
        String genero = ScanenerUtils.capturarTexto("a que genero pertenece");
        double calificar = ScanenerUtils.capturarDecimal("que calificacion le das");
        int duracion = ScanenerUtils.capturarEntero("duracion del live");

        String nombreUsuarios = ScanenerUtils.capturarTexto("cual es tu nombre");
        String apellidoUsuarios = ScanenerUtils.capturarTexto("cual es tu apellido");
        String email = ScanenerUtils.capturarTexto("cual es tu email");

        Live live = new Live(nombreLive, duracion, genero, calificar);



        UsuarioVisualizador usuario = new UsuarioVisualizador(nombreUsuarios, apellidoUsuarios, email);
        usuario.ver(live);
        System.out.println(live.obtenerFichaTecnica());

    }
}