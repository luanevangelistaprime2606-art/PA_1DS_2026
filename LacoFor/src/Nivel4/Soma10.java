package Nivel4;
import java.util.Scanner;

public class Soma10 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);		
		int i, n, soma;
		soma = 0;
		i = 0;
		
		for (i = 1; i <=10; i++) {
			System.out.println("Insira um número: ");
			n = ler.nextInt();
			soma = soma + n;
			System.out.println(soma+ " é a soma.");
		}
	}
}