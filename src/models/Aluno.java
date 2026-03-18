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
    }
    public void agendarAulaPratica(){
        aulasPraticas++;
    }
    public void cancelarAulaTeorica(){
        aulasTeoricas--;
    }
    public void cancelarAulaPratica(){
        aulasPraticas--;
    }
    public void realizarExame(){
        if (aulasPraticas < 5 & aulasTeoricas < 5){

            if (aprovado){
                System.out.println("Você ja foi aprovado");
            }else{
                System.out.println("Você precisa no minimo de 5 aulas teoricas e praticas");
            }

        }else{
            //realizar o exame
            //não aprendemos random mas precisamos implementar este metodo logo
            // utilizamos Random e random.nextboolean
            Random random = new Random();
            aprovado = random.nextBoolean();
            System.out.println("Status de aprovação:" + aprovado);
        }
    }

}
