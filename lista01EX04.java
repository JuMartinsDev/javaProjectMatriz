package exMatrizes;

import java.util.Scanner;

public class lista01EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int [][] array = new int [12][5];
		String [] produto = new String [] {"A","B","C","D","E","F","G","H","I","J","K","L"};
		String [] loja = new String [] {"LojaA","LojaB","LojaC","LojaD","LojaE"};
		
		for(int i=0; i<12; i++) {
			System.out.println("-----Produto: "+produto[i]);
			for(int j=0; j<5; j++) {
				System.out.println("Informe o preço na loja "+loja[i]+" :");
				array[i][j]=entrada.nextInt();
			}
		}
		
		
		
		
		
	}
}
