package Aula;

import java.util.ArrayList;

public class Aulas {

    private int horario;
    private int dia;
    private int notificação;
    private static final ArrayList Aula = new ArrayList();

    public Aulas(int hora, int dia, int noti) {
        this.horario = hora;
        this.dia = dia;
        this.notificação = noti;
    }

    public void addAula(Aulas aula) {
        Aula.add(aula);
    }

}
