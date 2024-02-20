package exMatrizes;

import java.util.Scanner;

public class lista01EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int [][]arrayM = new int [2][2];
		int [][]arrayR = new int [2][2];
		int maiorEle=0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				System.out.println("Informe o número ["+i+","+j+"] : ");
				arrayM[i][j]=entrada.nextInt();
				
				if(arrayM[i][j]>maiorEle) {
					maiorEle=arrayM[i][j];
				}
			}
		}
				for(int i=0; i<2; i++) {
					for(int j=0; j<2; j++) {
						
						arrayR[i][j]=maiorEle*arrayM[i][j];
						System.out.println("Resultado - Matriz R [" +i+ "," +j+ "] : "+arrayR[i][j]);	
					}
					}	

}
}
