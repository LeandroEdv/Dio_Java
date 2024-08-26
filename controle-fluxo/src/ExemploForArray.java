public class ExemploForArray {
    
public static void main(String[] args) {
    String alunos [] = {"Felipe", "jonas", "julia", "maria"};

    for(int x =0; x < alunos.length; x ++){ // for (inicialização; validação; incremento)
        System.out.println("O aluno no indice x = "+ x + " é: "+ alunos[x]);
    }

    // FOR EACH
    for (String aluno: alunos){
        System.out.println("o aluno é: " + aluno);
    }
}
}
