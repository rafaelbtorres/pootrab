package Menus;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Adicionar {

    public boolean adicionarDisciplina() {
        Scanner e = new Scanner(System.in);
        String nome = null, professor = null, curso = null, semestre = null, turma = null, notificacao = null, aula = null, minutos = null;
        System.out.println("Digite o nome da Disciplina que deseja adicionar: ");
        nome = ValidarEntradaUsuario.nextLine(nome);
        System.out.println("Digite o nome do Professor que ministra essa disciplina: ");
        professor = ValidarEntradaUsuario.nextLine(professor);
        System.out.println("Digite o nome do curso dessa disciplina: ");
        curso = ValidarEntradaUsuario.nextLine(curso);
        System.out.println("Digite o semestre que será cursado esta disciplina: ");
        semestre = ValidarEntradaUsuario.nextInt(semestre);
        System.out.println("Digite em qual turma que será cursado esta disciplina: ");
        turma = ValidarEntradaUsuario.nextLine(turma);
        System.out.println("Deseja receber uma notificação?\n1- SIM   2- NAO");
        int resp = e.nextInt();
        switch (resp) {
            case 1:
                do {
                    System.out.println("Digite quantos minutos antes da aula deseja ser avisado: ");
                    minutos = ValidarEntradaUsuario.nextInt(minutos);
                }while(!minutos.equalsIgnoreCase("0") && minutos.equalsIgnoreCase("200"));
                
                break;

        }

        return false;
    }

}
