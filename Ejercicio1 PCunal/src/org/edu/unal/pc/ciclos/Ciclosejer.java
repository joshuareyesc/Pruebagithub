package org.edu.unal.pc.ciclos;
import java.util.*;
public class Ciclosejer {
	public static void main(String[] args) {
		int num, contador;
		//num guardara los numeros introducidos
		//contador se incrementara para llevar la cuenta de los numeros
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		num = scan.nextInt();
		contador = 0; // al comienzo los numeros introducidos es 0
		while(num>0)
		{
			contador = contador + 1;
			System.out.println("introduzca otro numero: ");
			num = scan.nextInt();
		}
		System.out.println("se han Introducido: " + contador + " numeros");
		scan.close();
	}
}
