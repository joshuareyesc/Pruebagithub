package org.edu.unal.pc;

import java.util.*;

public class Ejemplo1 {
// miembros grupo Jeisson Florez Nieves, Juan Diego Munoz Ortiz y Joshua Felipe Reyes Castillo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraval = scan.nextInt();
		int[] array1 = new int[arraval];
		int N = 1;
		int O = 0;
		for(int i = 0; i<array1.length; i++) {
			array1[O]= N;
			O++;
			N++;
		}
			System.out.println("valor arreglo = " + Arrays.toString(array1));
		scan.close();
	}
}
