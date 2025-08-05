public class ExemploForArray {

    // em arrays o indice deve começar em 0
    // e o tamanho do array é sempre 1 a menos que o número de elementos
    // exemplo: se o array tem 5 elementos, o último índice é 4
    public static void main(String[] args) {
        String alunos[]  = {"João", "Maria", "José", "Ana", "Pedro"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }

}
