import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        /*8. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
        el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y
        el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.*/

        //Creacion de variables
            double sueldoBase;
            double venta1;
            double venta2;
            double venta3;
            double comisionTotal;
            double totalFinalMes;
            Scanner input = new Scanner(System.in);

        System.out.println("Cordial saludo, bienvenido a la calculadora de salarios");

        System.out.println("Por favor ingrese su sueldo base");
            sueldoBase = input.nextDouble();
        System.out.println("Por favor ingresar el valor en dolares de su primera venta");
            venta1 = input.nextDouble();
        System.out.println("Por favor ingresar el valor en dolares de su segunda venta");
            venta2 = input.nextDouble();
        System.out.println("Por favor ingresar el valor en dolares de su tercer venta");
            venta3 = input.nextDouble();

            comisionTotal = (venta1 + venta2 + venta3 ) * 0.10;
            totalFinalMes = sueldoBase + comisionTotal;

        System.out.println("Su total de comisiones este mes es: " + comisionTotal +
                "\nY el valor total de su pago este mes será de: " + totalFinalMes);

    }
}
