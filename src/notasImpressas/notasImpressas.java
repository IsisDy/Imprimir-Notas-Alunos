package notasImpressas;
import java.util.Scanner;
// O programa tem que imprimir o nome do aluno sua nota em uma tabela
//

public class notasImpressas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String aluno1;
		String aluno2;
		String aluno3;
		String aluno4;
		String aluno5;
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double nota4 = 0.0;
		double nota5 = 0.0;
		
		//aluno1
		System.out.println("Digite o nome do primeiro aluno: ");
		aluno1 = input.nextLine();
		System.out.println("Digite a nota do primeiro aluno: ");
		String nota11 = Double.toString(nota1);
		nota11 = input.nextLine();
		
		//aluno2
		System.out.println("Digite o nome do segundo aluno: ");
		aluno2 = input.nextLine();
		System.out.println("Digite a nota do segundo aluno: ");
		String nota22 = Double.toString(nota2);
		nota22 = input.nextLine();
		
		//aluno3
		System.out.println("Digite o nome do terceiro aluno: ");
		aluno3 = input.nextLine();
		System.out.println("Digite a nota do terceiro aluno: ");
		String nota33 = Double.toString(nota3);
		nota33 = input.nextLine();
		
		//aluno4
		System.out.println("Digite o nome do quarto aluno: ");
		aluno4 = input.nextLine();
		System.out.println("Digite a nota do quarto aluno: ");
		String nota44 = Double.toString(nota4);
		nota44 = input.nextLine();
		
		//aluno5
		System.out.println("Digite o nome do quinto aluno: ");
		aluno5 = input.nextLine();
		System.out.println("Digite a nota do quinto aluno: ");
		String nota55 = Double.toString(nota5);
		nota55 = input.nextLine();
		
		System.out.println("ALUNOS(A)\tNOTAS");
		System.out.println("========\t=====");
		System.out.println(aluno1 +"\t\t"+ nota11);
		System.out.println(aluno2 +"\t\t"+ nota22);
		System.out.println(aluno3 +"\t\t"+ nota33);
		System.out.println(aluno4 +"\t\t"+ nota44);
		System.out.println(aluno5 +"\t\t"+ nota55);
		

	}

}
