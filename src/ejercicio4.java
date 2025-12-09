import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // 4.	Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

            //Crear variables
            double numero1;
            double numero2;
            double suma;
            double resta;
            double multiplicacion;
            double division;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingresar un numero");
            numero1 = input.nextDouble();
        System.out.println("Por favor ingresar otro numero");
            numero2 = input.nextDouble();

            suma = numero1 + numero2;
            resta = numero1 - numero2;
            multiplicacion = numero1 * numero2;

            if (numero2 != 0) {
                division = numero1 / numero2;
                System.out.println("La division de tus numeros es: "+division);
            }else {
                System.out.println("No es posible dividir entre 0");
            }

        System.out.println("La suma de tus dos numeros es: "+suma);
        System.out.println("La resta de tus 2 numeros es: "+resta);
        System.out.println("La multiplicacion de tus dos numeros es: "+multiplicacion);

    }
}
