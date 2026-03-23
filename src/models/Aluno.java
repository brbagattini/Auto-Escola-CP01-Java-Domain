package models;

import java.util.Random;

public class Aluno {
    public String nome;
    public int idade;
    public String tipoVeiculo;
    public int aulasTeoricas;
    public int aulasPraticas;
    public boolean aprovado;

    public void agendarAulaTeorica(){
        aulasTeoricas++;
        System.out.println("Aluno:" + nome);
        System.out.println("Você realizou +1 aula teorica total:"+ aulasTeoricas);
    }
    public void agendarAulaPratica(){
        aulasPraticas++;
        System.out.println("Aluno:" + nome);
        System.out.println("Você realizou +1 aula pratica total:"+ aulasTeoricas);

    }
    public void cancelarAulaTeorica(){
        System.out.println("Aluno:" + nome);
        aulasTeoricas--;
        System.out.println("Você cancelou 1 aula teorica total:"+ aulasTeoricas);
    }
    public void cancelarAulaPratica(){
        System.out.println("Aluno:" + nome);
        aulasPraticas--;
        System.out.println("Você cancelou 1 aula pratica total:"+ aulasPraticas);
    }
    public void realizarExame(){
        if (aulasPraticas < 5 || aulasTeoricas < 5){
                System.out.println("Aluno:" + nome);
                System.out.println("Não apto para realizar o exame, você precisa no minimo de 5 aulas teoricas e praticas");


        }else{

            if (aprovado) {
                System.out.println("Aluno:" + nome);
                System.out.println("Você ja foi aprovado");
            }else{
                //realizar o exame
                //não aprendemos random mas precisamos implementar este metodo logo
                // utilizamos Random e random.nextboolean
                Random random = new Random();
                aprovado = random.nextBoolean();
                System.out.println("Aluno:" + nome);
                System.out.println("Você realizou a prova:");
                System.out.println("Status de aprovação:" + aprovado);
            }

        }
    }

}
