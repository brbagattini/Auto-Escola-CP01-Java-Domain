package models;


import java.util.ArrayList;

public class AutoEscola {

    private ArrayList<Aluno> alunosCadastrados = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunosCadastrados.add(aluno);
        System.out.println("Aluno cadastrado com sucesso");
    }

    public void exibirResumo(){
        for(Aluno i: alunosCadastrados){
            System.out.println("lista");
        }
    }
}
