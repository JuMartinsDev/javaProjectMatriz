package exMatrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lista02EX06 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		
		String [] produtos = new String [] {"Camisa","Blusa","Calça","Vestido","Meia"};
		double [][] array = new double [5][4];
		double [] custo = new double [] {10,15,20,10,5};
		double [][] impostos = new double [5][4];
		double  precTot=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe do preço do produto : "+produtos[i]);
			for(int j=0; j<4; j++) {
				System.out.println("Preço do produto na loja "+(j+1)+" : ");
				custo[i]=(double)(Math.random()*190);
			}
		}

		System.out.println("");
		System.out.println("----------------------");
		
		for(int i=0; i<5; i++) {
			System.out.println("Nome do produto: "+produtos[i] +" - Custo : "+numFormatado.format(custo[i]));
			for(int j=0; j<4; j++) {
				System.out.println("Loja :"+(j+1));
				
				if(custo[i]<=50) {
					impostos[i][j]=custo[i]*0.05;
				} else {
					if(custo[i]>=50.01 && custo[i]<=100) {
						impostos[i][j]=custo[i]*0.10;
					}else {
						if(custo[i]<=100) {
							impostos[i][j]=custo[i]*0.20;
						}
					}
				}
				
				System.out.println("Impostos = R$ " +numFormatado.format(impostos[i][j]));
				System.out.println("Preço = R$ " +numFormatado.format(custo[i]));
				
				precTot=impostos[i][j]+custo[i];
				System.out.println("Preço Final: R$ "+numFormatado.format(precTot));
			}
		}
		
	
		
	}

}
