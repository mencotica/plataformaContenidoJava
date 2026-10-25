package platzi.play;

import platzi.play.contenido.Live;
import platzi.play.plataforma.UsuarioVisualizador;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hola mundo!");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cual es tu nombre?");
//        String nombre = scanner.nextLine();
//
//        System.out.println("hola " + nombre + ", esto es platzi play!");
//
//        System.out.println(nombre + "cuantos años tienes?");
//        int edad = scanner.nextByte();
//
//        System.out.println(nombre + " pudes ver contenido +" + edad);

        Live live = new Live();
        live.titulo = "Stream del momento";
        live.fechaEstreno = LocalDate.now();
        live.genero = "Fantasia";
        live.calificar(4.5);

        UsuarioVisualizador usuario = new UsuarioVisualizador();
        usuario.nombre = "santiago";
        usuario.fechaRegistro = LocalDateTime.now();
        usuario.ver(live);
        System.out.println(live.obtenerFichaTecnica());

    }
}