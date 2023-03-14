
import java.util.Scanner;

public class CadastroDeAlunos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[][] alunosDoFIC = new String[2][5];
		String[] cadastro = { "Digite o nome do Aluno", "Digite a idade do Aluno", "Digite o Curso do Aluno",
				"Digite o período do Curso", "Digite a duração do Curso" };

		// Cadastrar os alunos do FIC
		for (int x = 0; x < alunosDoFIC.length; x++) {

			// Carregar os dados do aluno
			for (int y = 0; y < cadastro.length; y++) {
				System.out.println(cadastro[y]);
				alunosDoFIC[x][y] = ler.nextLine();
			}
		}

		// Imprimir a relação do cadastro de alunos do FIC
		for (int x = 0; x < alunosDoFIC.length; x++) {

			// Imprimir os dados do aluno
			for (int y = 0; y < cadastro.length; y++) {

				System.out.print(alunosDoFIC[x][y]);
				System.out.print(" - ");

			}
			System.out.println("");
		}

		int buscaPorIdade = 0;
		int total = 0;

		// Solicitar a idade ao usuário
		System.out.println("Escolha a idade: maior ou igual");
		buscaPorIdade = ler.nextInt();

		// Fazer a varredura da relação de alunos do FIC
		for (int x = 0; x < alunosDoFIC.length; x++) {

			// Fazer a comparação somente do quesito idade
			if (buscaPorIdade <= Integer.parseInt(alunosDoFIC[x][1])) {
				total++;
			}
		}
		// Imprimir o total encontrado
		System.out.println("alunos com idade igual ou maiores que " + buscaPorIdade + " anos: " + total);

		String Curso = null;
		// Zerando a variável
		total = 0;
		// Solicitar o curso ao usuário
		System.out.println("Escolha o Curso");
		// Zerar o buffer do console para mudar para String
		ler.nextLine();
		Curso = ler.nextLine();

		// Fazer a varredura da relação de alunos do FIC
		for (int x = 0; x < alunosDoFIC.length; x++) {

			// Fazer a comparação somente do quesito Curso
			if (alunosDoFIC[x][2].equals(Curso)) {
				total++;
			}
		}
		// Imprimir o total encontrado
		System.out.println("Total de alunos no Curso de " + Curso + " = " + total);
	}
}
