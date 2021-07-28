import java.util.Scanner;

public class Ejerciclos3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Introduzca un numero: ");
		num = scan.nextInt();
		while (num != 0)
		{
			if(num % 2 == 0)
			// si el resto de dividir entre 2 es 0 esto indica que es par
				System.out.println("Par");
			else
				//en caso contrario es impar
				System.out.println("Impar");
			// repetimos el procesp y volvemos a leer num
			System.out.println("Introduzca otro numero: ");
			num = scan.nextInt();
		}
		System.out.println("Juego finalizado");
		// al salir del while tenemos la certeza que num es 0 
		scan.close();
	}

}
