package exMatrizes;

import java.util.Scanner;

public class DESAFIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String [] produtos = new String [] {"Notebook", "Computador","Tablet", "Servidores"};
		int [][] qtd = new int [7][4];
		int somaLinha=0,  somaColuna =0, melhorLinha=0, piorLinha=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<4; j++) {

				System.out.println("Informe a quantidade de "+produtos[i]+" vendidos :");
				qtd[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("----------------A)---------------");
		
		for(int i=0; i<4; i++) {
			somaColuna=0;
			for(int j=0; j<4; j++) {
				somaColuna+=qtd[i][j];
			}
			System.out.println("O total de produtos vendidos de "+produtos[i]+" é de: "+somaColuna);
		}
		
		System.out.println("-------------B) E D)--------------");
		
		for(int i=0; i<4; i++) {
			somaLinha=0;
			for(int j=0; j<4; j++) {
				somaLinha+=qtd[j][i];
			}
			System.out.println("O total de produtos vendidos de "+produtos[i]+" é de: "+somaLinha);
			
			if(somaLinha>=10) {
				System.out.println("O trimestre atingiu a meta: "+(i+1));	
		}
		}
		
		System.out.println("-------------C)--------------");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
			
				if(somaColuna>melhorLinha) {
					melhorLinha=somaColuna;
				} else {
					if(piorLinha<melhorLinha) {
					piorLinha=somaColuna;
				}
				}
			}
		}
		System.out.println("Melhor linha de produto no período :"+melhorLinha);
		System.out.println("Pior linha de produto no período :"+piorLinha);
	
		
}
}
