import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];

    public void adiciona(Aluno aluno) {
        //recebe um aluno
    }

    public Aluno pega(int posicao) {
        //recebe uma posição e devolve o aluno
        return null;
    }

    public void remove(int posicao) {
        //remove pela posição
    }

    public boolean contem(Aluno aluno) {
        //descobre se o aluno está ou não na lista
        return false;
    }

    public int tamanho() {
        //devolve a quantidade de alunos
        return 0;
    }

    public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    }
}
