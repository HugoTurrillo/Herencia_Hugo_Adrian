package Clases;

import java.util.*;
public class Casa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce los metros cuadrados de la entrada: ");
		int metrosCuadradosEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el numero de puertas de la entrada: ");
		int numeroPuertasEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el numero de ventanas de la entrada: ");
		int numeroVentanasEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Tiene puerta blindada (S/N): ");
		String puertaBlindadaRespuesta= sc.nextLine();
		boolean puertaBlindada=false;
		if(puertaBlindadaRespuesta=="S") {
			puertaBlindada=true;
		}
		Hall entrada= new Hall("entrada",metrosCuadradosEntrada,numeroPuertasEntrada,numeroVentanasEntrada,puertaBlindada );
	}

}