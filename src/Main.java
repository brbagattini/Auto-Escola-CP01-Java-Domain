import models.Aluno;
import models.AutoEscola;
import models.Instrutor;
import models.Veiculo;

public class Main {
    public static void main(String[] args){
        //iniciar Escola
        System.out.println("Bem vindo a sistema da auto escola");
        AutoEscola autoEscola = new AutoEscola();
        System.out.println("=============================");
        //criação de 4 alunos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "juresvaldo";
        aluno1.idade = 18;
        aluno1.aulasPraticas = 14;
        aluno1.aulasTeoricas = 20;
        aluno1.aprovado = false;
        aluno1.tipoVeiculo = "carro";
        autoEscola.adicionarAluno(aluno1);

        System.out.println("=============================");


        Aluno aluno2 = new Aluno();
        aluno2.nome = "colosteu";
        aluno2.idade = 28;
        aluno2.aulasPraticas = 11;
        aluno2.aulasTeoricas = 10;
        aluno2.aprovado = true;
        aluno2.tipoVeiculo = "moto";
        autoEscola.adicionarAluno(aluno2);

        System.out.println("=============================");


        Aluno aluno3 = new Aluno();
        aluno3.nome = "vlaumir";
        aluno3.idade = 19;
        aluno3.aulasPraticas = 4;
        aluno3.aulasTeoricas = 3;
        aluno3.aprovado = false;
        aluno3.tipoVeiculo = "moto";
        autoEscola.adicionarAluno(aluno3);

        System.out.println("=============================");


        Aluno aluno4 = new Aluno();
        aluno4.nome = "Zézin";
        aluno4.idade = 32;
        aluno4.aulasPraticas = 20;
        aluno4.aulasTeoricas = 19;
        aluno4.aprovado = true;
        aluno4.tipoVeiculo = "carro";
        autoEscola.adicionarAluno(aluno4);

        System.out.println("=============================");


        Instrutor dorisvaldo = new Instrutor();
        dorisvaldo.nome = "Dorisvaldo";
        dorisvaldo.categoria = "carro";
        dorisvaldo.experiencia = 37;


        Veiculo nissanR32 = new Veiculo();
        nissanR32.modelo = "nissan R32";
        nissanR32.tipo = "carro";
        nissanR32.placa = "FVS-3829";



        //simular realização de aulas
        aluno3.agendarAulaPratica();

        System.out.println("=============================");

        aluno3.agendarAulaTeorica();

        System.out.println("=============================");

        aluno2.cancelarAulaTeorica();

        System.out.println("=============================");

        aluno2.cancelarAulaPratica();

        System.out.println("=============================");

        aluno3.realizarExame();

        System.out.println("=============================");

        aluno3.agendarAulaTeorica();

        System.out.println("=============================");
        //simular exame
        aluno3.realizarExame();
    }
}
