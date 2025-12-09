import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        /* 13.	Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt
        no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede calcular?*/


        // Crear variables

                double numero;
                Scanner input = new Scanner(System.in);
                double raizCuadrada;
                double raizCubica;

        System.out.println("Por favor ingres 1 numero");
            numero = input.nextDouble();

            raizCuadrada = Math.sqrt(numero);
            raizCubica = Math.pow(numero, 1.0 / 3.0);

        System.out.println("La raiz cuadrada de tu numero es: " +raizCuadrada+ " \n Y la raiz cubica de tu numero es: " +raizCubica);

    }
}
