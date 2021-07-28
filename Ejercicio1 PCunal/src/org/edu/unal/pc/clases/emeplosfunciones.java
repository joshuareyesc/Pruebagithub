package org.edu.unal.pc.clases;
import java.util.*;
public class emeplosfunciones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite los dos numeros con los que quiere hacer la operacion ");
		
			
		double nume1 = scan.nextDouble();
		double nume2 = scan.nextDouble();
	calculadora calcular = new calculadora();
		System.out.println(" ¿Que operacion desea hacer? \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5. salir " );
		int operacion = scan.nextInt();
		if(operacion ==1) {
			System.out.println(calcular.Suma(nume1,nume2));
		}
		if(operacion ==2) {
			System.out.println(calcular.Resta(nume1,nume2));
		
		}
		if(operacion ==3) {
			System.out.println(calcular.Multiplicacion(nume1,nume2));
		}
		if(operacion ==4) {
			System.out.println(calcular.Division(nume1,nume2));
		}
		if (operacion==5) {
			System.out.println("Gracias por usar e");
		}
		
}


}