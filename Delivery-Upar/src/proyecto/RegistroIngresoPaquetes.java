
package proyecto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RegistroIngresoPaquetes {
private long num_paquete;
private String estadopaquete;
private Cliente  clientes;
private Remitente remitentes;
private Paquete  paquetes;
private Calendar cal= new GregorianCalendar(2021,9,20);
private int dia;
private int mes;
private int año;

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

public RegistroIngresoPaquetes(){
    
this.num_paquete=0000000001;
this.estadopaquete="Ingresado";
this.dia=cal.get(Calendar.DATE);
this.mes=cal.get(Calendar.MONTH);
this.año=cal.get(Calendar.YEAR);

}

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Remitente getRemitentes() {
        return remitentes;
    }

    public void setRemitentes(Remitente remitentes) {
        this.remitentes = remitentes;
    }

    public Paquete getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Paquete paquetes) {
        this.paquetes = paquetes;
    }


    public long getNum_paquete() {
        return num_paquete;
    }

    public void setNum_paquete(int num_paquete) {
        this.num_paquete = num_paquete;
    }

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }
    public void impresionregistro(){
        System.out.println("Registro de Ingreso de Paquetes");
        System.out.println("\nNo. Paquete:"+num_paquete
        +"\t\tFecha de Ingreso: "+dia+"/"+mes+"/"+año
        +"\n\nDatos Destinatario\n"
        +"Nombre: "+clientes.getNombre()+"\nApellido: "+clientes.getApellido()
        +"\nDireccion: "+clientes.getCalle_carrera()+" # "+clientes.getNumcasa()
        +"\nCódigo Postal: "+clientes.getCodpostal()
        +"\nTeléfono: "+clientes.getTelefono());
        
        System.out.println("\nDatos Remitente"
        +"\nNombre: "+remitentes.getNombre()
        +"\nApellido: "+remitentes.getApellido()
        +"\nDireccion: "+remitentes.getCalle_carrera()+" # "+remitentes.getNumcasa()
        +"\nPaís: "+remitentes.getPais()
        +"\nCiudad: "+remitentes.getCiudad()
        +"\nTelefono: "+remitentes.getTelefono());
        
        System.out.println("\nDatos Paquete"
        +"\nTipo: "+paquetes.getTipo()
        +"\nPeso: "+paquetes.getPeso()+" Kg"
        +"\nDimensiones (Largo X Ancho X Alto): "+paquetes.getLargo()+" cm X "+paquetes.getAncho()+" cm X "+paquetes.getAlto()+" cm"
        +"\nValor: "+paquetes.getValor()+" USD"
        +"\nEstado Actual paquete: "+estadopaquete);
        System.out.println("-----------------------------------------------");
    
    }
}
