import java.util.Scanner;

public class CadastroDeAlunos3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String alunosDoFIC[][] = new String[4][6];

		String[] cadastro = { "Digite o nome do Aluno", "Digite a idade do Aluno", "Digite o curso do Aluno",
				"Digite o período do curso", "Digite a duração do curso", "Sexo" };

		for (int x = 0; x < alunosDoFIC.length; x++) {

			for (int y = 0; y < cadastro.length; y++) {

				System.out.println(cadastro[y]);

				alunosDoFIC[x][y] = ler.nextLine();
			}
		}

		for (int x = 0; x < alunosDoFIC.length; x++) {

			System.out.print(alunosDoFIC[x][0]);
			System.out.print(" | " + alunosDoFIC[x][1]);
			System.out.print(" | " + alunosDoFIC[x][2]);
			System.out.print(" | " + alunosDoFIC[x][3]);
			System.out.print(" | " + alunosDoFIC[x][4]);
			System.out.println(" | " + alunosDoFIC[x][5]);

		}

		int buscaPorIdade = 20;
		int total;
		

		System.out.println("Busque por idade maior ou igual");

		for (int x = 0; x < alunosDoFIC.length; x++) {

			for (int y = 0; y < cadastro.length; y++) {

				System.out.println(cadastro[y]);

				alunosDoFIC[x][y] = ler.nextLine();
				
				if(buscaPorIdade >= 18) {
					
					if(alunosDoFIC == buscaPorIdade) {
						
						System.out.println(alunosDoFIC);
						
						
					}
					
					
					
					
					
					
					
				}
				
			}
			
			++total
		}
	}

}
