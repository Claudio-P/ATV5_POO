import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando estudantes
        
        Estudante estudante1 = new Estudante("Marcelo", "Camaragibe");
        Estudante estudante2 = new Estudante("Ricardo", "Recife");
        estudante1.addCursoNota("Informática", 9);
        estudante1.addCursoNota("Redes", 7);
        estudante2.addCursoNota("História", 8);
        estudante2.addCursoNota("Sociologia", 10);

        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();

        // Adicionando estudantes ao array de pessoas

        pessoa.add(estudante1);
        pessoa.add(estudante2);

        // Criando professores

        Professor professor1 = new Professor("Maria", "Jaboatão");
        Professor professor2 = new Professor("Eduardo", "Recife");
        professor1.addCurso("Informática");
        professor1.addCurso("Redes");
        professor2.addCurso("História");
        professor2.addCurso("Sociologia");


        // Adicionando professores ao array de pessoas

        pessoa.add(professor1);
        pessoa.add(professor2);

        for (int i = 0; i < pessoa.size(); i++) {
            Pessoa p = pessoa.get(i);
            if (p.getClass() == Estudante.class) {
                System.out.println(p.getNome() + " " + p.getEndereço() + " " + "Estudante");
            } else {
                System.out.println(p.getNome() + " " + p.getEndereço() + " " + "Professor(a)");
            }
        }
    }
}