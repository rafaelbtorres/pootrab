package Agenda;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dias {

    public String pegarDiaSem() {
        Date d = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        String nome = "";
        int dia = c.get(c.DAY_OF_WEEK);
        switch (dia) {
            case Calendar.SUNDAY:
                nome = "Domingo";
                break;
            case Calendar.MONDAY:
                nome = "Segunda";
                break;
            case Calendar.TUESDAY:
                nome = "Terça";
                break;
            case Calendar.WEDNESDAY:
                nome = "Quarta";
                break;
            case Calendar.THURSDAY:
                nome = "Quinta";
                break;
            case Calendar.FRIDAY:
                nome = "Sexta";
                break;
            case Calendar.SATURDAY:
                nome = "sábado";
                break;
        }
        return nome;
    }

    public int pegarDiaMes() {
        Date d = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        String nome = "";
        int dia = c.get(c.DAY_OF_WEEK);       
        return dia;
    }
}
