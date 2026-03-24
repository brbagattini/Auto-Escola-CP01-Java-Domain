package models;


import java.util.ArrayList;

public class AutoEscola {

    private ArrayList<Aluno> alunosCadastrados = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunosCadastrados.add(aluno);
        System.out.println("Aluno "+ aluno.nome +" cadastrado com sucesso");
    }

    public void exibirResumo(){
        System.out.println("resumo de alunos:");
        System.out.println("=================");
        for(Aluno i: alunosCadastrados){
            System.out.println("-> "+i.nome + " aprovado: " +i.aprovado);
        }
    }

}
