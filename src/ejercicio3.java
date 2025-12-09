import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //3.Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

        //Crear variables

            float cateto1;
            float cateto2;
            double hipotenusa;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingresar la medida en centimetros de su cateto1");
            cateto1 = input.nextFloat();
        System.out.println("Por favor ingresar la medida en centimetros de su cateto2");
            cateto2 = input.nextFloat();

            hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("La hipotenusa de tu triangulo rectangulo es: "+hipotenusa);
    }
}
