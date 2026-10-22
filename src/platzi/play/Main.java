package platzi.play;

import platzi.play.contenido.VideoLargo;

import java.util.Scanner;

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

        VideoLargo videoLargo = new VideoLargo();
        videoLargo.titulo = "El señor de los anillos";
        videoLargo.anioPublicacion = 2024;
        videoLargo.genero = "Fantasia";
        videoLargo.calificar(4.5);
    }
}