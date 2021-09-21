
package proyecto;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Consultas {
private String username;
private String password;
private int cantpaquetesentregados;
private int cantpaquetesdevueltos;
private int cantpaquetesregistrados;
private Calendar cal= new GregorianCalendar(2021,9,20);
private int dia;
private int mes;
private int año;
private String estadopaquete;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantpaquetesdevueltos() {
        return cantpaquetesdevueltos;
    }

    public void setCantpaquetesdevueltos(int cantpaquetesdevueltos) {
        this.cantpaquetesdevueltos = cantpaquetesdevueltos;
    }

    public int getCantpaquetesregistrados() {
        return cantpaquetesregistrados;
    }

    public void setCantpaquetesregistrados(int cantpaquetesregistrados) {
        this.cantpaquetesregistrados = cantpaquetesregistrados;
    }


    public Date getFechaentregapaquete() {
        return fechaentregapaquete;
    }

    public void setFechaentregapaquete(Date fechaentregapaquete) {
        this.fechaentregapaquete = fechaentregapaquete;
    }
private Date fechaentregapaquete;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCantpaquetesentregados() {
        return cantpaquetesentregados;
    }

    public void setCantpaquetesentregados(int cantpaquetesentregados) {
        this.cantpaquetesentregados = cantpaquetesentregados;
    }

    

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }

    
}
