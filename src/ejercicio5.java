import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        /* 5.	Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
         Recordar que la fórmula para la conversión es: C = (F-32)*5/9 */

        //Crecion de variables

           double fahrenheit;
            double celsius;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese los grados fahrenheit que desa convertir a grados celcius");
            fahrenheit = input.nextDouble();

            celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("La convercion a grados celsius da como resultado: "+celsius);

    }
}
