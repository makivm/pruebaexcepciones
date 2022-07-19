package ppal;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Principal {

	public static int getEnteroValidado() {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		boolean ok=true;
		do {
			try {
				System.out.println("Introduce un numero entero:");
				String texto = teclado.nextLine();
				num = Integer.parseInt(texto);
				ok=true;
			} catch (NumberFormatException e) {
				System.out.println("Debes introducir un número entero");
				ok=false;
			}
		} while (!ok);
		return num;
	}
	
	public static void main(String[] args) {
		
		int num = getEnteroValidado();
		int num2  = getEnteroValidado();
		
		System.out.println("Tus numeros son :"+num + " y "+num2);
		
		
		
		
		System.out.println("hasta luego");
		
		
		
	}
}
