import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aluno {
    String matricula;
    String nome;
    Curso curso;
    Date dataNascimento;

    public void setDataNascimento(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
        try {
            dataNascimento = sdf.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public int idade(){
        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.setTime(this.dataNascimento);
        Calendar dataHoje = Calendar.getInstance();
        int idadeAtual = dataHoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        dataNascimento.add(Calendar.YEAR,idadeAtual);
        System.out.println(dataHoje.get(Calendar.DATE));
        System.out.println(dataNascimento);
        if (dataHoje.before(dataNascimento)){
            System.out.println(idadeAtual);
            idadeAtual--;
        }
        return idadeAtual;
    }

    public void gerarMatricula() {
        matricula = "200300400";
    }

}
