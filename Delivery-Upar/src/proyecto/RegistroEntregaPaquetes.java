
package proyecto;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class RegistroEntregaPaquetes {
private Paquete infopaquete;
private Repartidor inforepartidor;
private Cliente infocliente;
private String efectividadentrega;
private String observacion;
private String estadopaquete;
private Calendar cal= new GregorianCalendar(2021,9,23);
private Calendar fecha = Calendar.getInstance();
private int dia;
private int mes;
private int año;
private int hora;
private int min;
private int seg;

    public RegistroEntregaPaquetes() { 
        this.dia=cal.get(Calendar.DATE);
        this.mes=cal.get(Calendar.MONTH);
        this.año=cal.get(Calendar.YEAR);
        this.hora = fecha.get(Calendar.HOUR_OF_DAY);
        this.min = fecha.get(Calendar.MINUTE);
        this.seg = fecha.get(Calendar.SECOND);
        this.efectividadentrega="Correcta";
        this.observacion="Ninguna";
        this.estadopaquete="Entregado";
    }

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

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


    public Paquete getInfopaquete() {
        return infopaquete;
    }

    public void setInfopaquete(Paquete infopaquete) {
        this.infopaquete = infopaquete;
    }

    public Repartidor getInforepartidor() {
        return inforepartidor;
    }

    public void setInforepartidor(Repartidor inforepartidor) {
        this.inforepartidor = inforepartidor;
    }

   

    public Cliente getInfocliente() {
        return infocliente;
    }

    public void setInfocliente(Cliente infocliente) {
        this.infocliente = infocliente;
    }

    public String getEfectividadentrega() {
        return efectividadentrega;
    }

    public void setEfectividadentrega(String efectividadentrega) {
        this.efectividadentrega = efectividadentrega;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
     
    public void registrovisita(){
        System.out.println("Registro de Entrega de Paquete"
        +"\n\nDatos del paquete"
        +"\nTipo: "+infopaquete.getTipo()
        +"\nPeso: "+infopaquete.getPeso()+" Kg"
        +"\nCódigo postal: "+infocliente.getCodpostal()
        +"\nFecha de entrega: "+dia+"/"+mes+"/"+año+" (dd/MM/yyyy)"
        +"\nHora de entrega: "+hora+":"+min+":"+seg+" (HH:mm:ss)");
        System.out.println("\nDatos Repartidor"
        +"\nNombre: "+inforepartidor.getNombre()
        +"\nApellido: "+inforepartidor.getApellido()
        +"\nNum Documento: "+inforepartidor.getNumdocumento()
        +"\nEfectividad de la entrega: "+efectividadentrega);
        System.out.println("\nRecibe: "+infocliente.getNombre()+" "+infocliente.getApellido()
        +"\nNum Documento: "+infocliente.getId()
        +"\nObservaciones: "+observacion
        +"\nEstado Actual Paquete: "+estadopaquete); 
    }
}
