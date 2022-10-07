import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private String sigla;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void matricularAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void listarAlunos() {
		System.out.printf("%s - Alunos\n",sigla);
		System.out.printf("Matricula \t Nome\n\n");
		for(Aluno aluno : alunos) {
			System.out.printf("%s \t %s\n",
					aluno.getMatricula(), aluno.getNome());
		}
	}
	
	public List<Aluno> buscarAluno(String busca) {
		List<Aluno> alunosPesquisa = new ArrayList<Aluno>();
		for(Aluno aluno : alunos) {
			if(aluno.getNome().contains(busca)) {
				alunosPesquisa.add(aluno);
			}
		}
		return alunosPesquisa;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

		
}
