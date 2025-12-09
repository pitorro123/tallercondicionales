import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Escibir un programa que pregunte al usuario su nombre y luego salude.

        // Crear variables

        String nombre;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre");
        nombre = input.nextLine();

        System.out.println("Buenos dias señor@ "+nombre);
    }
}