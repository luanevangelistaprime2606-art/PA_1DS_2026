package Nivel4;
import java.util.Scanner;
public class QuantosPares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);		
		int num, quantpar, i;
		i=0; quantpar = 0;
		
		for (i = 1; i<=10; i++) {
			System.out.println("Escolha um número: ");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				quantpar++;
				System.out.println("A quantidade de pares é de " +quantpar+ " pares digitados");
			}
		}
	}
}