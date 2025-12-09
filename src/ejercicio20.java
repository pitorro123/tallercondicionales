import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
/* 20.	Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
        después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).
         */

        // Crear variables
        int monedas1euro;
        int monedas2euros;
        int monedas50centimos;
        int monedas20centimos;
        int monedas10centimos;
        double totalEnEuros;
        double totalCentimos;
        double centimos;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de monedas de 1 euro que tiene");
        monedas1euro = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de monedas de 2 euro que tiene");
        monedas2euros = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de monedas de 50 centimos que tiene");
        monedas50centimos = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de monedas de 20 centimos que tiene");
        monedas20centimos = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de monedas de 10 centimos que tiene");
        monedas10centimos = input.nextInt();

        totalCentimos = monedas1euro * 100 + monedas2euros *200 + monedas50centimos *50 + monedas20centimos *20 + monedas10centimos *10;
        totalEnEuros = totalCentimos /100;
        centimos = totalCentimos %100;

        System.out.println("Tienes un total de: " +totalEnEuros + "euros y " + centimos + "centimos");


    }
}
