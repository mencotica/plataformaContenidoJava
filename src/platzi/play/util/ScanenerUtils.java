package platzi.play.util;

import java.util.Scanner;

public class ScanenerUtils {

    public static Scanner scanner = new Scanner(System.in);

    public static String capturarTexto (String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }

    public static int capturarEntero (String mensaje) {
        System.out.println(mensaje + ": ");

        int dato = scanner.nextInt();
        scanner.nextLine(); //este comando desprecia el enter
        return dato;
    }

    public static double capturarDecimal (String mensaje) {
        System.out.println(mensaje + ": ");

        double dato = scanner.nextDouble();
        scanner.nextLine();
        return dato;
    }
}
