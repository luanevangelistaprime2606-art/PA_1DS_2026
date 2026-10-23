package Nivel4;
import java.util.Scanner;
public class LerDe1 {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner (System.in) ;
		 int i, n;
		 
		 System.out.println("Escolha um número: ");
		 n = ler.nextInt();
		 
		 for (i=1; i<=n; i++) {
			 System.out.println(i);
		 }
	}
}