package exMatrizes;

import java.util.Scanner;

public class exSLIDE01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int [][] array = new int [4][4];
		int somaLinha=0, totalGeral=0,somaColuna=0, totalGeralC=0;

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				
				System.out.println("Digite o valor [Linha " +i+ " - Coluna "+j+"] : ");
				array[i][j]=entrada.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			somaLinha=0;
			somaColuna=0;
			for(int j=0; j<4; j++) {
				somaLinha=somaLinha+array[i][j];
				//somaLinha+=array[i][j];
				
				//somaColuna=somaColuna+array[i][j];
				somaColuna+=somaColuna+array[i][j];
		
			}
			System.out.println("A soma da linha " +i+ " é : "+somaLinha);
			System.out.println("A soma da coluna "+i+ "é : "+somaColuna);
			
			 totalGeral=totalGeral+somaLinha;
			 //totalGeral+=somaLinha
		}	 
		 System.out.println("Total geral : " +totalGeral);
		 
	}

}
