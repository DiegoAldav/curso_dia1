package clase1;

import java.util.Scanner;

public class ejercicio_1c {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.println("ingrese 0 para pares y 1 para impares");
		int opcion = teclado.nextInt();
		
		if (opcion==1) {
		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == 0) {
				System.out.print(numeroInicio+", ");
			}
			
			numeroInicio++;
		}
		} else if (opcion==0) {
			while (numeroInicio <= numeroFin) {
				if (numeroInicio % 2 != 0) {
					System.out.print(numeroInicio+", ");
				}
				
				numeroInicio++;
			}
			} else {
				System.out.println("numero ingresado incorrecto");
			}
		
	}

}
