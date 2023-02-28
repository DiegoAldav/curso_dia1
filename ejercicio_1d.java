package clase1;

public class ejercicio_1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		for (int i = numeroInicio; i <= numeroFin; i++) {
			if (i % 2 == 0) {
				System.out.print((numeroFin-i+6)+", ");
			}
		}
	}

}
