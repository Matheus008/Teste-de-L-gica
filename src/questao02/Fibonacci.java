package questao02;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroParaPesquisa = 0;
		boolean fimDaBusca = false;
		
		long a = 0;
		long b = 1;
		
		System.out.println("Digite um número para procurar na  sequência de Fibonacci!");
		numeroParaPesquisa = sc.nextInt();
		
		while (fimDaBusca == false) {
	            long next = a + b;
	            a = b;
	            b = next;
	            
	            if (a == numeroParaPesquisa) {
	            	fimDaBusca = true;
	            	System.out.println("número encontrado!");
	            }
	            else if(a > numeroParaPesquisa) {
	            	fimDaBusca = true;
	            	System.out.println("número não pertence a sequência");
	            }
		}
		
	}
	
}
