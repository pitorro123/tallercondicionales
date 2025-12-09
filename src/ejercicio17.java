import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        /* 17.	Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
        El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la hora de llegada a
        la ciudad B.
         */

        // Crear variables

                int horaSalida;
                int minutosSalida;
                int segundosSalida;
                int llegadaSegundos;
                int tiempoFinalSegunods;
                int tiempoViajeSegunods;
                Scanner input = new Scanner(System.in);
                int horaDeLlegada;
                int minutosLlegada;
                int segundosLlegada;
                int resto;

        System.out.println("A continuacion se le solicitara su tiempo de salida en 3 secciones horas-minutos y segunods");
        System.out.println("Por favor ingrese su hora de salida");
            horaSalida = input.nextInt();
        System.out.println("Por favor ingrese los minutos de su salida");
            minutosSalida = input.nextInt();
        System.out.println("Por favor ingrese los segundos de su salida");
            segundosSalida = input.nextInt();
        System.out.println("Por favor ingrese el tiempo de su viaje en segundos");
            tiempoViajeSegunods = input.nextInt();

            llegadaSegundos = horaSalida * 3600 + minutosSalida *60 +segundosSalida;
            tiempoFinalSegunods = llegadaSegundos + tiempoViajeSegunods;
            horaDeLlegada = tiempoFinalSegunods / 3600;
            horaDeLlegada = horaDeLlegada % 24;
            resto = tiempoFinalSegunods % 3600;
            minutosLlegada = resto / 60;
            segundosLlegada = resto % 60;

        System.out.println("La hora de llegada a la ciudad b es: " +horaDeLlegada + ":" + minutosLlegada + ":" + segundosLlegada);

    }
}
