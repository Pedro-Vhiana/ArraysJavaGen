package ArraysJava;

import java.util.Scanner;

public class ListaPosicao {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num[]= {7,6,5,4,3,2,1,8,9,10,11};
		int x;
		
		System.out.print("Informe a posição desejada: ");
		x = scan.nextInt();
		
		if(x <= 11) {
			System.out.println("O número dessa posição é "+num[x]);
		}else {
			System.out.println("Posição não existe");
		}
		
		
		
		
		

	}

}
