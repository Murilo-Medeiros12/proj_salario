package projeto_LPA.aula04;

import java.util.Scanner;

public class salario {
	public static void main (String [] args) {
		
		double salbruto, valorhora, inss, saliquido, horariot;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("hora trabalhada:");
		horariot = ler.nextDouble();
		
		System.out.print("valor por hora:");
		valorhora = ler.nextDouble();
		
		salbruto = horariot * valorhora;
				inss = salbruto * 0.12;
				saliquido = salbruto - inss;
		System.out.print("o valor do salario é:"+salbruto);
		System.out.print("\no valor do salario liquido é:"+saliquido);	
				
	}

}
