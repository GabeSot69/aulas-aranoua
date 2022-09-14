public class SalaDeAulaIFAM {
    public static void main(String[] args) {
        Aluno nelson,hana,matheus;
        Curso tads,mecanica,civil,gastronomia;
        Instituicao instituicao;

        tads = new Curso();
        tads.nome = "Tecnologia em Analise e Desenvolvimento de Sistemas";
        tads.nivel = "superior";

        instituicao = new Instituicao();
        instituicao.nome = "Instituto Federal do Amazonas";
        instituicao.sigla = "IFAM";

        hana = new Aluno();
        hana.nome = "Hana Yasmin";
        hana.curso = tads;
        hana.curso.instituicao = instituicao;
        hana.setDataNascimento("27/12/2000");
        hana.gerarMatricula();

        matheus = new Aluno();
        matheus.nome = "Matheus Assuncao";
        matheus.curso = tads;
        matheus.setDataNascimento("10/04/2001");
        matheus.gerarMatricula();

        nelson = new Aluno();
        nelson.nome = "Nelson Filho";
        nelson.curso = tads;
        nelson.setDataNascimento("15/07/2004");
        nelson.gerarMatricula();

        System.out.printf("%s, com idade %d, e matricula %s e aluno(a) do curso %s no %s - (%s)\n\n", hana.nome, hana.idade(), hana.matricula, hana.curso.nome, hana.curso.instituicao.nome, hana.curso.instituicao.sigla);
        System.out.printf("%s, com idade %d, e matricula %s e aluno(a) do curso %s no %s - (%s)\n\n", matheus.nome, matheus.idade(), matheus.matricula, matheus.curso.nome, matheus.curso.instituicao.nome, matheus.curso.instituicao.sigla);
        System.out.printf("%s, com idade %d, e matricula %s e aluno(a) do curso %s no %s - (%s)\n\n", nelson.nome, nelson.idade(), nelson.matricula, nelson.curso.nome, nelson.curso.instituicao.nome, nelson.curso.instituicao.sigla);


    }
}
