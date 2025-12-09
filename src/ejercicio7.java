import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
         /* 7.	Realiza un programa que reciba una cantidad de minutos y muestre por
        pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.*/

        // Crear variables

            int minutos;
            int horas;
            int minutoRestantes;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese los minutos que desea convertir ");
            minutos = input.nextInt();

            horas = minutos / 60;
            minutoRestantes = minutos % 60;

        System.out.println( + minutos + " minutos esquivalen a un total de " + horas + " horas y " +minutoRestantes+ " minutos");

    }
}
