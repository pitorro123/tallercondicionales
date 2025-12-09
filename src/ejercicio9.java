import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        /* 9.	Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
        cuanto deberá pagar finalmente por su compra.  */

        //Crear las variables

            double totalDeCompra;
            double descuento;
            double totalApagar;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el total de su compra");
            totalDeCompra = input.nextDouble();

            descuento = totalDeCompra * 0.15;
            totalApagar = totalDeCompra - descuento;

        System.out.println("El descuento por su compra es de: " +descuento+ " \nY el total a pagar es de: " +totalApagar);

    }
}
