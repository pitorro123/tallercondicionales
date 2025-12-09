import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        /* 19.	Escribir un algoritmo para calcular la nota final de un estudiante, considerando que:
        por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
        Imprime el resultado obtenido por el estudiante.
         */

        //Crear variables

                int respuestasCorrectas;
                int respuestasIncorrectas;
                int respuestasBlanco;
                int notaFinal;
                Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de respuestas correctas que optuvo en el examen");
            respuestasCorrectas = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de respuestas incorrectas que optuvo");
            respuestasIncorrectas = input.nextInt();
        System.out.println("Por favor ingrese la cantidad la cantidad de preguntas que no logro responder");
            respuestasBlanco = input.nextInt();

            notaFinal = respuestasCorrectas * 5 + respuestasIncorrectas * (-1) + respuestasBlanco*0;

        System.out.println("La nota final obtenida es: " +notaFinal);


    }
}
