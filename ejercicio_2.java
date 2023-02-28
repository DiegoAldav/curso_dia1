import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //datos segun la pagina del gobierno al 2023
        //faltan detalles, pero lo quiero entregar
        // no se como lo vez vos lucas

        System.out.println("ingrese ingresos");
        int ingresos = teclado.nextInt();

        System.out.println("ingrese cantidad de vehiculos");
        int vehiculos = teclado.nextInt();

        System.out.println("ingrese antiguedad de los vehiculos");
        int antiguedadVehiculos = teclado.nextInt();


        System.out.println("ingrese cantidad de inmuebles que posee");
        int inmuebles = teclado.nextInt();

        System.out.println("ingrese 1 para si y 0 para no\n posee alguna embracacion");
        int embarcacion, aeronave, titularAcativosSocietario;
        embarcacion = teclado.nextInt();

        System.out.println("ingrese 1 para si y 0 para no\n posee alguna aeronave");
        aeronave = teclado.nextInt();


        System.out.println("ingrese 1 para si y 0 para no\n es titular de activos societarios");
        titularAcativosSocietario = teclado.nextInt();

        int vehiculos1 = 0;
        if (vehiculos == 0) {
            antiguedadVehiculos = 0;
        } else if (vehiculos == 1 && antiguedadVehiculos > 3) {
            vehiculos1 = 1;
        } else  if(vehiculos == 1 && antiguedadVehiculos < 3) {
            vehiculos1 = 2;
        }

        int vehiculos2 = 0;
        if (vehiculos  == 1 && antiguedadVehiculos <3) {
            vehiculos2 = 1;
        } else if (vehiculos == 2 && antiguedadVehiculos <3) {
            vehiculos2 = 2;
        }

        int vehiculos3 = 0;
        if (vehiculos >= 3 && antiguedadVehiculos < 5) {
            vehiculos3 = vehiculos;
        }

        if (ingresos < 163539 && (vehiculos1 <= 1 ) && inmuebles <= 1 && embarcacion == 0 && aeronave == 0 && titularAcativosSocietario ==0) {
            System.out.println("pertenese al segmento de ingresos menores");
        } else if (((ingresos >= 163539 && ingresos < 572386.50) && (vehiculos <3) && inmuebles<= 2 && (embarcacion == 0 && aeronave == 0 && titularAcativosSocietario == 0)) || (vehiculos2 == 1 || vehiculos2 == 2) && (embarcacion == 0 && aeronave == 0 && titularAcativosSocietario == 0) && inmuebles<= 2) {
            System.out.println("pertenese al segmento de ingresos medios");
        } else if ((ingresos > 572386.50 || (vehiculos3 >= 3 ) || inmuebles >= 3) || (embarcacion >= 1 || aeronave >= 1 || titularAcativosSocietario >=1)) {
            System.out.println("pertenese al segmento de ingresos altos");
        } else {
            System.out.println("evaluar segmento de ingresos");
        }


    }
}

