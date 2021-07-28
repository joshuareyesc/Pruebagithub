package org.edu.unal.pc.clases;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.FileWriter;
public class prom {
	private BufferedReader lector;
	private String linea;
	private String partes []= null;
	private String lista []=null;
	
	Usuario ure = new Usuario();
	public void leercsv(String nomarchivo) {
		try {
			lector = new BufferedReader(new FileReader(nomarchivo));
			while((linea = lector.readLine()) != null) {
				partes = linea.split(",");
				imprimirLinea();
				System.out.println();
			}
			lector.close();
			linea = null;
			partes =null;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void imprimirLinea() {
		for(int i =0;i<partes.length;i++) {
			System.out.println(partes[i]);
		}
	}
	public void escribir(String nomarchivo) {
		
		String nom = ure.getNombre();
		String tele = ure.getTelefono();
		String ema = ure.getEmail();
		
		Usuario usu = new Usuario(nom,tele,ema);
		lista
	
}
}
