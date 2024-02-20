package exMatrizes;

import java.util.Scanner;

public class lista01EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int [][] arrayClientes = new int [4][5];
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite o código do " +(i+1)+" cliente : ");
			arrayClientes[i][0]=entrada.nextInt();
			System.out.println("Digite a qtd de milhagem : ");
			arrayClientes[i][1]=entrada.nextInt();
			System.out.println("Digite a categoria do " +(i+1)+" cliente : ");
			arrayClientes[i][2]=entrada.nextInt();
			
			while((arrayClientes[i][2] !=1) && (arrayClientes[i][2] !=2) && (arrayClientes[i][2] !=3)){
				System.out.println("Digite a categoria do cliente corretamente 1/2/3 : ");
				arrayClientes[i][2]=entrada.nextInt();
			}
				
				if(arrayClientes[i][2] == 1) {
					arrayClientes[i][3] = 1000;
				} else {
					if(arrayClientes[i][2] == 2) {
						arrayClientes[i][3] = 5000;
					}
				}
			arrayClientes[i][4]=(arrayClientes[i][1]+arrayClientes[i][3]);
		}
		
		for(int i=0; i<4; i++) {
			System.out.println("------------------");
			System.out.println("Código do cliente" +(i+1)+ " : "+arrayClientes[i][0]);
			System.out.println("Qtde. Milhagem : "+arrayClientes[i][1]);
			System.out.println("Categoria do cliente" +(i+1)+ " : "+arrayClientes[i][2]);
			System.out.println("Bônus do cliente" +(i+1)+ " : "+arrayClientes[i][3]);
			System.out.println("Milhagem Atual : "+arrayClientes[i][4]);
		}
		
		
		
		
		
	}

}
