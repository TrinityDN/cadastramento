import java.util.Scanner;

public class CadastroDeAlunos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String alunosDoFIC[][] = new String[4][5];

		String[] cadastro = { "Digite o nome do Aluno", "Digite a idade do Aluno", "Digite o curso do Aluno",
				"Digite o período do curso", "Digite a duração do curso" };

		for (int x = 0; x < alunosDoFIC.length; x++) {

			System.out.println(cadastro[0]);

			alunosDoFIC[x][0] = ler.nextLine();

			System.out.println(cadastro[1]);

			alunosDoFIC[x][1] = ler.nextLine();
			System.out.println(cadastro[2]);

			alunosDoFIC[x][2] = ler.nextLine();
			System.out.println(cadastro[3]);

			alunosDoFIC[x][3] = ler.nextLine();
			
			System.out.println(cadastro[4]);

			alunosDoFIC[x][4] = ler.nextLine();

		}
		
		for(int x = 0; x < alunosDoFIC.length; x++) {
			
			System.out.print(alunosDoFIC[x] [0]);
			System.out.print(" | " + alunosDoFIC [x] [1]);
			System.out.print(" | " + alunosDoFIC [x] [2]);
			System.out.print(" | " + alunosDoFIC [x] [3]);
			System.out.println(" | " + alunosDoFIC [x] [4]);
			
		}

	}

}
