import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //6.	Calcular la media de tres números pedidos por teclado.

        // Crear variables

            double numero1;
            double numero2;
            double numero3;
            double media;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingresar su primer numero");
            numero1 = input.nextDouble();
        System.out.println("Por favor ingresar el siguente numero");
            numero2 = input.nextDouble();
        System.out.println("Por favor ingresar el ultimo numero ");
            numero3 = input.nextDouble();

            media = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media de los 3 numeros ingresados es: "+media);
    }
}
