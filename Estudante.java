import java.util.ArrayList;

public class Estudante extends Pessoa {
    private int numCursos; 
    private ArrayList<String> cursos = new ArrayList<>();
    private ArrayList<Integer> notas = new ArrayList<>(); 

    public Estudante(String nome, String endereço) {
        super(nome, endereço);
    }

    public boolean addCursoNota(String curso, int nota) {
        cursos.add(curso);
        notas.add(nota);
        return true;
    }

    public void imprimeNotas() {
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
        }
    }

    public double getNotaMedia() {
        int i = 0;
        int soma = 0;
        for (i = 0; i < notas.size(); i++) {
            soma = soma + notas.get(i); 
        }
        double media = soma / i;
        return media;
    }

    @Override
    public String toString() {
        return "Estudante [cursos=" + cursos + ", notas=" + notas + ", numCursos=" + numCursos + "]";
    }
}
