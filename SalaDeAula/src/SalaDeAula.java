
public class SalaDeAula {

	public static void main(String[] args) {
		Aluno matheus = new Aluno();
		matheus.setNome("Matheus Assun��o");
		matheus.setDataNascimento("08/12/1999");
		System.out.printf("O aluno %s nasceu em %s\n",
				matheus.getNome(), matheus.getDatanascimento());
		
		Curso tads = new Curso();
		tads.setNome("Tecnologia em An�lise e Desenvolvimento de Sistemas");
		tads.setSigla("TADS");
		tads.matricularAluno(new Aluno("200300400", "Matheus Sun��o"));
		tads.matricularAluno(new Aluno("200300401", "Nelson Filho"));
		tads.matricularAluno(new Aluno("200300402", "Hana Yasmin"));
		tads.matricularAluno(new Aluno("200300403", "Ademar Castro"));
		tads.listarAlunos();
		
		Curso quimica = new Curso();
	}

}
