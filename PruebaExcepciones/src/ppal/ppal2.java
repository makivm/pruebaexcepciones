package ppal;

import java.util.ArrayList;

public class ppal2 {

	public static ArrayList<Integer> listaNumeros;
	
	public static int getElemento(int pos) {
		int num=0;
		try {
			num= listaNumeros.get(pos);
			System.out.println("en el metodo getElemento");
		}catch (IndexOutOfBoundsException e) {
			num=-1;
		}
		return num;
	}
	
	public static void main(String[] args) {
		listaNumeros=new ArrayList<>();
		listaNumeros.add(3);
		listaNumeros.add(9);
		listaNumeros.add(1);
		listaNumeros.add(4);
		listaNumeros.add(8);
		listaNumeros.add(-2);
		
		System.out.println("el numero que ocupa la posicion 8 es: "+getElemento(8));
	}

}
