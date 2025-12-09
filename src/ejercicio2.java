import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // 2.	Calcular el perímetro y área de un rectángulo dada su base y su altura.

        // Crear variables

           float base;
            float altura;
            float perimetro;
            float area;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese cuanto mide la base de su rectangulo");
            base = input.nextFloat();

        System.out.println("Por favor ingrese la altura de su rectangulo");
            altura = input.nextFloat();

            perimetro = 2 * (base + altura);
            area = base * altura;

        System.out.println("El perimetro de si rectangulo es: "+perimetro);
        System.out.println("El area de su rectangulo es: "+area);

    }
}
