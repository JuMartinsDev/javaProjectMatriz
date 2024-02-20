package exMatrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lista01EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		
		String [] lojas = new String [] {"A","B","C","D","E","F","G","H"};
		String [] produtos = new String [] {"W","X","Z","Y"};
		double [][] precos = new double [4][8];
		
		for(int i=0;i<4;i++) {
			System.out.println(produtos[i]);
			for(int j=0;j<8;j++) {
				System.out.println("informe o preço do produto "+produtos[i]+" na loja "+lojas[j]+":");
				//precos[i][j]=entrada.nextDouble();
				precos[i][j]=(double)(Math.random()*190);	
			}
		}
		
		System.out.println("-------------------------------");
		System.out.println("---------Produtos que custam menos de 120 -------------");
		System.out.println("---------------------------------");
		
		for(int i=0;i<4;i++) {
			System.out.println(produtos[i]);
			for(int j=0;j<8;j++) {
				
				if(precos[i][j]>120) {
				
				System.out.println("Loja: " +lojas[i]+ " Preço: R$ " +numFormatado.format(precos[i][j]));
				
			}
		
		
		
			}
		
	}

	}
}
