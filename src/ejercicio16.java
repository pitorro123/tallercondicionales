import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
         /* 16.	Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d.
        El que está detrás viaja a una velocidad mayor.
        Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h)
         y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
         */

        // Crear variables

                double v1;
                double v2;
                double velocidadRelativa;
                double distancia;
                double tiempoHoras;
                double tiempoMinutos;
                Scanner input = new Scanner(System.in);

        System.out.println("Se le solicitaran dos velociddes para realizar el calculo, " +
                "por favor tenga en cuenta que la velocidad 2 debe ser mayor a la velocidad 1");
        System.out.println("Por favor ingrese la velocidad 1");
            v1 = input.nextDouble();
        System.out.println("Por favor ingrese la velocidad 2");
            v2 = input.nextDouble();
        System.out.println("Por favor ingrese la distancia en km entre los vehiculos");
            distancia = input.nextDouble();

            if (v2 > v1){
                velocidadRelativa = v2 - v1;
                tiempoHoras = distancia / velocidadRelativa;
                tiempoMinutos = tiempoHoras * 60;
                System.out.println("El vehiculo mas rapido alcanza al otro en: " + tiempoMinutos + " minutos");
            }else{
            System.out.println("Recuerde por favor que la velocidad 2 debe ser mayor a la velocidad 1");
        }

    }
}
