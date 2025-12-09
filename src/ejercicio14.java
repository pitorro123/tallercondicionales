import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        /*14.	Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo,
        si se introduce 23 que muestre 32. */

        // Crear variables

                int numero;
                Scanner input = new Scanner(System.in);
                int decena;
                int unidad;
                int invertido;

        System.out.println("Por favor ingrese un numero de dos cifras ");
            numero = input.nextInt();

          if (numero >= 10 && numero <= 99) {
              System.out.println("Valido");
              decena = numero / 10;
              unidad = numero % 10;
              invertido = unidad * 10 + decena;

              System.out.println("Su numero invertido es: " +invertido);
          }else {
              System.out.println("Error el numero debe ser de dos digitos");
          }

    }
}
