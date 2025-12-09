import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        /* 12. Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
        Calcula y muestra la distancia entre ellos. */

        // Variables

            double x1;
            double y1;
            double x2;
            double y2;
            double dx;
            double dy;
            double distancia;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese x1");
            x1 = input.nextDouble();
        System.out.println("Por favor ingrese y1");
            y1 = input.nextDouble();
        System.out.println("Por favor ingrese x2");
            x2 = input.nextDouble();
        System.out.println("Por favor ingrese y2");
            y2 = input.nextDouble();

            dx = x2 - x1;
            dy = y2 - y1;
            distancia = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));

        System.out.println("La distancia entre tus dos numero es: " +distancia);

    }
}
