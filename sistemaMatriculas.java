package exMatrizes;

import java.util.Scanner;

public class lista02EX05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int [][] sem1 = new int [5][3];
		int [][] sem2 = new int [5][3];
		int [][] anual = new int [5][3];
		int maiorMat=0;

		System.out.println("");
		System.out.println("----------------1° SEMESTRE--------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite o núm. de inscritos no 1°sem no curso " +(i+1)+ " na unidade " +(j+1));
				sem1[i][j]=(int)(Math.random()*190);
			}
		}
		System.out.println("");
		System.out.println("----------------2° SEMESTRE--------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.println("Digite o núm. de inscritos no 2°sem no curso " +(i+1)+ " na unidade " +(j+1));
				sem1[i][j]=(int)(Math.random()*190);
				
			}
		}
		System.out.println("");
		System.out.println("----------QTD DE ALUNOS POR CURSO E UNIDADE NO ANO--------------");
		for(int i=0; i<5; i++) {
			System.out.println("Curso "+(i+1));
			for(int j=0; j<3; j++) {
				anual[i][j]=sem1[i][j]+sem2[i][j];
				System.out.println("Unidade "+(j+1)+ ":"+anual[i][j]);
			}
		}
		System.out.println("");
		System.out.println("----------QTD DE MATRICULAS POR UNIDADE--------------");
		for(int j=0; j<3; j++) {
			System.out.println("Qtd. de matriculas da unidade "+(j+1)+":"+anual[0][j]);
		}
		
		System.out.println("");
		System.out.println("----------QTD DE MATRICULAS POR CURSO--------------");
		for(int i=0; i<5; i++) {
			System.out.println("Qtd. de matriculas da curso "+(i+1)+": "+anual[i][0]);
		
		}
		System.out.println("");
		System.out.println("----------MAIOR NÚMERO DE MATRÍCULAS--------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(anual[i][j]>maiorMat) {
					maiorMat=anual[i][j];
				}
			}
		}

		System.out.println("Maior número de matrículas é de : "+maiorMat);
	}

}
