package org.edu.unal.pc.estructurascontrol;

import java.util.*;

public class Econtrol {
	static String USUARIO = "abc";
	 static String CONTRASENA = "123ABC";


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user ="";
		String pwd = "";
		do {
			System.out.println("Ingrese sus usuario");
			user = scan.nextLine();
			System.out.println("Ingrese su contrase�a");
			pwd = scan.nextLine();
			if (!CONTRASENA.equals(pwd))
				System.out.println("Contrase�a incorrecta");
			if(!USUARIO.equals(user))
				System.out.println("usuario incorrecto");
			
			
		}while((!CONTRASENA.equals(pwd)) || (!USUARIO.equals(user)));

		System.out.println("credenciales correctas!!!! ");
	}
}
