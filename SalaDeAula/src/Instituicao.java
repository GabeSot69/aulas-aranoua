import java.util.ArrayList;
import java.util.List;

public class Instituicao {
	private String nome;
	private String sigla;
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void listarCursos() {
		System.out.println(sigla + " - Cursos");
		System.out.println("Curso\t\tSigla");
		for(Curso curso : cursos) {
			System.out.println(curso.getNome() + "\t\t" + curso.getSigla());
			
		}
	}
	
	public void listarAlunos() {
		System.out.println(sigla + " - Alunos");
		for(Curso curso: cursos) {
			System.out.println(curso.getNome());
			curso.listarAlunos();
			System.out.println();
		}
	}

}
