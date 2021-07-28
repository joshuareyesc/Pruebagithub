package org.edu.unal.pc.clases;
import java.util.*;
public class Funciones {
// miembros grupo Jeisson Florez Nieves, Juan Diego Munoz Ortiz y Joshua Felipe Reyes Castillo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int F = scan.nextInt();
		int C = scan.nextInt();
		boolean ConF =((3<=F) && (F<=500))  ;
		boolean ConC = ((3<=C) && (C<=500));
		int lath = F - 2;
		int latv = C - 2;
		int total = lath*latv;
		int totalex = (F*C) - total;
		int[][] array1 = new int[F][C];
		if(ConF && ConC) {
			
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					if(((i ==0) || (i== array1.length-1)) || ((j==0) || (j== array1[i].length -1))) {

					array1[i][j] = totalex;
					System.out.print(array1[i][j]);
					
					if (j != array1[i].length - 1) 
						System.out.print("\t");
						
					
					}
					else {
						
						System.out.print(0);
					System.out.print("\t");
						
							
					}
				
				}
					
				System.out.println();
			
			}
		}
		else {
		System.out.println("ERROR EN LA ENTRADA");
		}
        scan.close();
        
	}

}
