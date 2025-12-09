import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
         /* 10.	Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se
            compone de los siguientes porcentajes:

        •	55% del promedio de sus tres calificaciones parciales.
        •	30% de la calificación del examen final.
        •	15% de la calificación de un trabajo final.
        El programa debe solicitar las tres notas obtenidas por el estudiante y según la nota debe mostrar lo siguiente de
        0 – 3 deficiente
        3.1 – 4 suficiente
        4.1 – 5 sobresaliente */

        // Crear variables
            double  notaParcial1;
            double notaParcial2;
            double notaParcial3;
            double notaExamenFinal;
            double notaTrabajoFinal;
            double promedio;
            double notaFinal;
            Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese la nota obtenida en el parcial 1");
            notaParcial1 = input.nextDouble();
        System.out.println("Por favor ingrese la nota obtenida en el parcial 2");
            notaParcial2 = input.nextDouble();
        System.out.println("Por favor ingrese la nota obtenida en el parcial 3");
            notaParcial3 = input.nextDouble();
        System.out.println("Por favor ingrese la nota obtenida en el trabajo final");
            notaTrabajoFinal = input.nextDouble();
        System.out.println("Por favor ingrese la nota obtenida en el examen final");
            notaExamenFinal = input.nextDouble();


            promedio = (notaParcial1 + notaParcial2 + notaParcial3) / 3;
            notaFinal = (promedio * 0.55) + (notaExamenFinal * 0.30) + (notaTrabajoFinal * 0.15);

        System.out.println("Su nota final es: " +notaFinal);

        if (notaFinal >= 0 && notaFinal<= 3) {
            System.out.println("Su estado academico es deficiente");
        } else if (notaFinal >= 3.1 &&notaFinal <= 4) {
            System.out.println(" Su estado academico es suficiente");
        } else {
            System.out.println("Su estado academico es sobresaliente");
        }

    }
}
