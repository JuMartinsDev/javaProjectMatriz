package exMatrizes;

import java.util.Scanner;

public class lista02EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String [] cidades = new String [] {"Campinas", "Bauru", "Sorocaba", "Atibaia", "Santos"};
		double [][] distancia = new double [5][5];
		double consumo=0,consumoPerc=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if(i==j) {
					distancia[i][j]=0;
				} else {
				System.out.println("Informe a distância entre a cidade "+cidades[i]+" e a cidade "+cidades[j]+" em km : ");
				distancia[i][j]=entrada.nextDouble();
				}
		}
	}
		System.out.println("");
		System.out.println("----------CONSUMO DE COMBUSTÍVEL POR VEÍCULO-----------");
		System.out.println("Informe o consumo de um veículo: ");
		consumo=entrada.nextDouble();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if(distancia[i][j]<250) {
				System.out.println("Distância: "+distancia[i][j]+ "km - entre a cidade "+cidades[i]+" e cidade "+cidades[j]);
			}
		}	
	}
		System.out.println("");
		System.out.println("----------CONSUMO POR PERCURSO-----------");
		
		for(int i=0; i<5; i++) {
			consumoPerc=0;
			for(int j=0; j<5; j++) {
				
				consumoPerc=distancia[i][j]/consumo;
		System.out.println("Consumo entre a cidade "+cidades[i]+" e "+cidades[j]+" é : "+consumoPerc+ "KM");
			}
		}
	}
}
