package Menus;

import java.util.Scanner;

public class MenuInicio {

    public void primeiro() {
        Scanner e = new Scanner(System.in);
        String resp = null;
        System.out.println("****BEM VINDO****");
        System.out.println("O que deseja fazer?");
        System.out.println("1- Cadastrar Disciplica    2- Cadastrar Aula    3- Consultar Horarios");
        resp = e.next();
        switch (resp){
            case "1":
                Adicionar ad = new Adicionar();
                ad.adicionarDisciplina();
            case "2":
                Adicionar ada = new Adicionar();
                ada.adicionarDisciplina();
            case "3":
                Adicionar add = new Adicionar();
                add.adicionarDisciplina();
            default:
                System.out.println("Opção invalida!");
        }
    }
}
