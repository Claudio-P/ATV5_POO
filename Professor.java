import java.util.ArrayList;

public class Professor extends Pessoa {
    private int numCursos;
    private ArrayList<String> cursos = new ArrayList<>();

    public Professor(String nome, String endereço) {
        super(nome, endereço);
    }

    public boolean addCurso(String curso) {
        cursos.add(curso);
        return true;
    }

    public boolean removeCurso(String curso) {
        cursos.remove(curso);
        return true;
    }

    @Override
    public String toString() {
        return "Professor [cursos=" + cursos + ", numCursos=" + numCursos + "]";
    }
}
