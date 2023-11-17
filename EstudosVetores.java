package ArraysJava;

import java.util.Arrays;

public class EstudosVetores {

	public static void main(String[] args) {
		
		//double v[]= {3,4,5,2,1};
		// Organizar o índice da lista ( Array, em ordem )
		//Arrays.sort(v);
		
		// Usando for-it == dá o mostra o valor armazenado dentro do Array.
		/*for (double valor: v) {
			System.out.print(valor + " ");
		}*/
		
		
		/*int vet[] = {3,7,6,1,9,4,2};
		// Transformando o array vet em v para mostrar o valor armazenado do array
		for(int v:vet) {
			System.out.println(v + " ");
		}
		System.out.println("");
		// Usando binarySearch para buscar o número digitado e exibir sua posição dentro do array.
		int p = Arrays.binarySearch(vet, 1);
		// Não existem indices negativos no Java, se o usuario digitar um valor que não existe dentro do Array, ele exibira o mesmo valor-
		// digitado, porém engativo.
		System.out.println("Encontrei o valor na posição "+p);*/
		
		
		// Atribuindo posições dentro do array
		int v[] = new int[20];
		
		// Aplicando valor a todas as posições do array com o método .fill
		// Parametro passados == nome da variavél que vai receber os valores, depois o valor que será atribuído
		Arrays.fill(v, 0);
		for(int valor: v) {
			System.out.println(valor);
		}
		
	}

}
