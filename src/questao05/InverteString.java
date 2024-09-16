package questao05;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String strigNormal;
		
		System.out.println("Insira uma palavra para ser invertida: ");
		strigNormal = sc.next();
		
		 String strigInvertida = "";
				 
	        for (int i = strigNormal.length() - 1; i >= 0; i--) {
	        	strigInvertida += strigNormal.charAt(i);
	        }
		
	        System.out.println(strigInvertida);
	}

}
