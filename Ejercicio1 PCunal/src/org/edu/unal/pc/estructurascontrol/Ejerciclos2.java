package org.edu.unal.pc.estructurascontrol;

import java.util.Scanner;

public class Ejerciclos2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Introduzca un numero: ");
		num = scan.nextInt();
		while (num != 0) // mientras sea distinto de cero
		{	
			if (num >0 )
				// mayor que cero : positivo
				System.out.println("Positivo");
			else 
				//si no es positivo : negativo
				System.out.println("Negativo");
			// repetimos el proceo y volvemos a leer num
			System.out.println("Introduzca otro numero:");
			num = scan.nextInt();
		}
		// al salir del mientras tenemos certeza que num es 0
		System.out.println("Programa finalizado");
		scan.close();
		
	}

}
