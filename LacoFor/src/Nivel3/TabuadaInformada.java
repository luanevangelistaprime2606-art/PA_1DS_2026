package Nivel3;
import java.util.Scanner;
public class TabuadaInformada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int i, n, res;
		
		System.out.println("Insira um número: ");
		n = ler.nextInt();
		for (i = 1; i<=10; i++) {
			res = n * i;
			System.out.println(n+ " x " +i+ " = " +res);
		}
	}
}