package platzi.play;

import platzi.play.contenido.Live;

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

        Live Live = new Live();
        Live.titulo = "El señor de los anillos";
        Live.anioPublicacion = 2024;
        Live.genero = "Fantasia";
        Live.calificar(4.5);

        System.out.println(Live.obtenerFichaTecnica());
    }
}