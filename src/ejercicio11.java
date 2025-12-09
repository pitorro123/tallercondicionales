import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        /*11.	Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia,
        de modo que el resultado sea siempre positivo).*/

        //Crear variables
            double numero1;
            double numero2;
            double diferencia;
            double distancia;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer numero");
            numero1 = input.nextDouble();
        System.out.println("Por favor ingrese el sugundo numero numero");
            numero2 = input.nextDouble();

            diferencia = numero1 - numero2;
            distancia = Math.abs(diferencia);

        System.out.println("La distancia entre tus dos numeros es: "+distancia);

    }
}
