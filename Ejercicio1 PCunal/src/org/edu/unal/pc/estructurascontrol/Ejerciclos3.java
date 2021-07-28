package org.edu.unal.pc.estructurascontrol;

import java.util.Scanner;

public class Ejerciclos3 {
	public static void main(String[] args) {
		int b = suma(5, 3);
		int c = suma(50, 30);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c + suma(10,20));
		String s = "A";
		System.out.println(s.compareTo("a"));
		
	}
public static int suma(int num1, int num2) {
	return num1 + num2;
}
public float suma(float num1, float num2) {
	return (float) num1 + num2;
}
public double suma(double num1, double num2) {
return (double) num1 + num2;
		
}
}

