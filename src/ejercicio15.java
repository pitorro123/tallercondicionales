import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
         /* 15.	Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie
        los valores de ambas variables y muestre cuanto valen al final las dos variables. */

        // Crear variables

            double A;
            double B;
            double aux;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el valor de s variable A");
            A = input.nextDouble();
        System.out.println("Por favor ingrese el valor de s variable B");
            B = input.nextDouble();

            aux = A;
            A = B;
            B = aux;

        System.out.println("El nuevo valor de A es: "+A);
        System.out.println("El nuevo valos de B es:"+B);

    }
}
