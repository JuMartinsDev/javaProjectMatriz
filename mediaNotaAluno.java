package exMatrizes;

import java.util.Scanner;

public class exSLIDE03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int [][] array = new int [3][4];
		double somaNota=0;
		
		for(int i=0; i<3; i++) {
			
			System.out.println("Aluno " +(i+1)+ " : ");
			array[i][0]=entrada.nextInt();
			
			for(int j=0; j<3; j++) {
				
				System.out.println("Informe a nota da " +(j+1)+ " prova : ");
				array[i][j]=entrada.nextInt();
				
			}
		}
		
		for(int i=0; i<3; i++) {
			somaNota=0;
			for(int j=0; j<3; j++) {
				somaNota+=array[i][j];
				
			}
			System.out.println("Média do aluno : " +(i+1)+somaNota/3);
		}

	}

}
