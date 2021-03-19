package ej5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    final static int[] NORMAL = {31,28,31,30,31,30,31,31,30,31,30,31};
    final static int[] BISIESTO = {31,29,31,30,31,30,31,31,30,31,30,31};

    private Date date;

    public Fecha(int dia, int mes, int anio) {
        date = new Date(anio, mes, dia);
    }

    public void sumar() {
        GregorianCalendar gregorianCalendar =
                new GregorianCalendar(date.getYear(), date.getMonth(), date.getDay());
        gregorianCalendar.add(GregorianCalendar.DATE, 1);
        System.out.println(gregorianCalendar.toString());
    }

    public boolean esBisiesto() {
        return new GregorianCalendar().isLeapYear(date.getYear());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
