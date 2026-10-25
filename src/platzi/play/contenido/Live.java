package platzi.play.contenido;

public class Live {

    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public int anioPublicacion;
    public double calificacion;
    public boolean disponible;


    public static void reproducir(){
        System.out.println("Reproduciendo " + this.titulo);
    }

    public String obtenerFichaTecnica () {
        return titulo + " (" + anioPublicacion + ")\n" + "Genero: " + genero +
                "\nCalificacion: " + calificacion + "/5" ;
    }

    public void calificar (double calificacion) {
        if (calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular() {
        return calificacion >=4;
    }
}
