package es.studium.Antisimetrica;

import java.util.Scanner;

public class Antisimetrica {
	public static void main(String[] args) {
		int tabla[][] = new int[3][3];
		int i, j;
		boolean antisimetrica= true;
		Scanner teclado = new Scanner(System.in);
	
		for( i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
		System.out.println("Ingrese el valor de la posici�n "+i+","+j);
		
		tabla[i][j] = teclado.nextInt();
		}
		}
		for( i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
			if (tabla[i][j]!=(-tabla[j][i]))
			{antisimetrica= false;
			}
			}
   	 }
		if(antisimetrica)
		{
			System.out.print("Es antisim�trica");
		}
        else 
        {
        System.out.print("No es antisim�trica");}
		teclado.close();
}
}
