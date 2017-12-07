package Menus;

import Aula.Aulas;
import Disciplinas.Disciplina;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Adicionar {

    public boolean adicionarDisciplina() {
        Scanner e = new Scanner(System.in);
        int minutos=0;
        System.out.println("Digite o nome da Disciplina que deseja adicionar: ");
        String nome = e.next();
        System.out.println("Digite o nome do Professor que ministra essa disciplina: ");
        String professor = e.next();
        System.out.println("Digite o nome do curso dessa disciplina: ");
        String curso = e.next();
        System.out.println("Digite o semestre que será cursado esta disciplina: ");
        String semestre = e.next();
        System.out.println("Digite em qual turma que será cursado esta disciplina: ");
        String turma = e.next();
        System.out.println("Deseja receber uma notificação?\n1- SIM   2- NAO");
        int resp = e.nextInt();
        switch (resp) {
            case 1:
                do {
                    System.out.println("Digite quantos minutos antes da aula deseja ser avisado: ");
                    minutos = e.nextInt();
                }while(minutos>=0 && minutos<=200);
                
                break;

        }
        Disciplina nova = new Disciplina(nome, professor, curso, semestre, turma, minutos);
        return false;
    }
    
    public boolean adicionarAula(){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite o nome da Disciplina: ");
        String nome = e.next();
        System.out.println("Digite o nome do Professor: ");
        String professor = e.next();
        System.out.println("Digite o horario da aula: ");
        int hora = e.nextInt();
        System.out.println("Digite o dia da aula: ");
        int dia =  e.nextInt();
        System.out.println("Digite o horario que deseja ser notificado: ");
        int noti = e.nextInt();
        Aulas aula = new Aulas(hora, dia, noti);
        aula.addAula(aula);
        return false;     
    }

}
