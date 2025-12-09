import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        //  18. Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

        // Crear variables

                String nombre;
                String apellido1;
                String apellido2;
                Scanner input = new Scanner(System.in);
                char inicialNombre;
                char inicialApellido1;
                char incialApellido2;



        System.out.println("Por favor ingrese su nombre");
            nombre = input.nextLine();
        System.out.println("Por favor ingrese su primer apellido");
            apellido1 = input.nextLine();
        System.out.println("Por favor ingrese su segundo apellido");
            apellido2 = input.nextLine();

            inicialNombre = nombre.charAt(0);
            inicialApellido1 = apellido1.charAt(0);
            incialApellido2 = apellido2.charAt(0);


        System.out.println("Las iniciales de tu nombre completo son: " +inicialNombre+ " " + inicialApellido1+ " " + incialApellido2);

    }
}
