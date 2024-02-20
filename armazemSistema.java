package exMatrizes;

import java.util.Scanner;

public class lista03EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int [][] estoque = new int [5][3];
		int somaProduto = 0, menorEstoque=0, maiorEstoque=0, maiorArmazem=0, menorArmazem=0,estoqueMaior=0, custoTotal=0;
		int somaColuna=0, custoTotalArmazem=0;
		
		for(int i=0; i<4; i++) {
			System.out.println("Estoque do armazém "+(i+1)+" :");
			for(int j=0; j<3; j++) {
				System.out.println("Informe a quantidade em estoque do produto "+(j+1)+" :");
				estoque[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("");
		System.out.println("--------------CUSTO DE CADA PRODUTO------------");
		for(int j=0; j<3; j++) {
			System.out.println("Informe o custo do produto: ");
			estoque[4][j]=entrada.nextInt();
		}
		
		System.out.println("");
		System.out.println("--------------QUANTIDADE DE ITENS EM CADA ARMAZÉM------------");
		for(int i=0; i<4; i++) {
			somaProduto=0;
			for(int j=0; j<3; j++) {
				somaProduto+=estoque[i][j];
			}
			System.out.println("Estoque no armazém "+(i+1)+" : "+somaProduto);
		}
		
		System.out.println("");
		System.out.println("--------------ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ------------");
		
		for(int i=0; i<4; i++) {
			if(estoque[i][1]<maiorEstoque) {
				maiorEstoque=estoque[i][1];
				maiorArmazem=i+1;
				//pega a linha que está e acrescenta 1 para ficar a linha certa;
			} 
			System.out.println("Armazém "+(i+1)+" - Quantidade em estoque: "+maiorEstoque);
		}
		
		System.out.println("");
		System.out.println("--------------ARMAZÉM COM MENOR ESTOQUE ------------");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				
				if(i==0 && j==0) {
					menorEstoque = estoque[i][j];
					menorArmazem=i+1;
					estoqueMaior = estoque[i][j];
					maiorArmazem=i+1;
				} else {
					if(estoque[i][j]>maiorEstoque) {
						estoqueMaior = estoque[i][j];
						maiorArmazem=i+1;
					}
				}
			}
		}
		
		System.out.println("--- Menor armazém ("+menorArmazem+") - Quantidade em estoque : "+maiorArmazem);
		
		System.out.println("");
		System.out.println("--------------CUSTO TOTAL DE CADA PRODUTO------------");

		for(int i=0; i<3; i++) {
			somaColuna=0;
			for(int j=0; j<4; j++) {
				somaColuna+=estoque[j][i];
				custoTotal=somaColuna*estoque[4][i];

	}
			System.out.println("Custo total do produto "+(i+1)+" :"+custoTotal);
}
		
		System.out.println("");
		System.out.println("--------------CUSTO TOTAL DE CADA ARMAZÉM------------");
		
		for(int i=0; i<4; i++) {
			custoTotalArmazem=0;
			for(int j=0; j<3; j++) {
				custoTotalArmazem+=(estoque[i][j]*estoque[4][j]);

	}
			System.out.println("Custo total do armazém ("+(i+1)+") :"+custoTotalArmazem);
}
		
		
}
}
