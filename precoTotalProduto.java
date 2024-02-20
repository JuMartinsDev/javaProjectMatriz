package exMatrizes;

import java.util.Scanner;

public class exSLIDE04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int [][] arrayProd = new int [3][2];
		double [][] precTot = new double [3][2];
		double totalGeral=0;
		
		for(int i=0; i<3; i++) {
			System.out.println("Produto "+(i+1));
			for(int j=0; j<1; j++) {
			
				System.out.println("Digite o código do produto " +(i+1)+ " :");
				arrayProd[i][0]=entrada.nextInt();
				System.out.println("Digigo e a quantidade do produto " +(i+1)+ " :");
				arrayProd[i][1]=entrada.nextInt();
				System.out.println("Digite o preço do produto " +(i+1)+ " :");
				precTot[i][0]=entrada.nextDouble();
		
				precTot[i][1]=arrayProd[i][1]*precTot[i][0];
				System.out.println("Total : "+precTot[i][1]);
			}
			totalGeral+=precTot[i][1];
		}
		System.out.println("Total Geral : "+totalGeral);
	}
}
