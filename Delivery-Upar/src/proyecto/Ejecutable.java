
package proyecto;


public class Ejecutable {



    public static void main(String[] args) {
        //Registro de Ingreso de paquete
        RegistroIngresoPaquetes registro1=new RegistroIngresoPaquetes();
        Cliente c1=new Cliente();
        Paquete p1=new Paquete();
        Remitente r1=new Remitente();
        registro1.setClientes(c1);
        registro1.setPaquetes(p1);
        registro1.setRemitentes(r1);
        registro1.impresionregistro();
        
        //Reparto paquete 
        Zonasentrega zona1=new Zonasentrega(200001); 
        Zonasentrega zona2=new Zonasentrega(200002);
        Zonasentrega zona3=new Zonasentrega(200005);
        RepartoPaquetes reparto1=new RepartoPaquetes();
        reparto1.getRepartidores().getZonas_entrega()[0]=zona1;
        reparto1.getRepartidores().getZonas_entrega()[1]=zona2;
        reparto1.getRepartidores().getZonas_entrega()[2]=zona3;
        reparto1.repartirpaquetes();  
        
        
        //Registro de Entrega de Paquete
        RegistroEntregaPaquetes entrega1=new RegistroEntregaPaquetes(); 
        Cliente c2=new Cliente();
        Paquete p2=new Paquete();
        Repartidor R1=new Repartidor();
        entrega1.setInfocliente(c2);
        entrega1.setInfopaquete(p2);
        entrega1.setInforepartidor(R1);
        entrega1.registrovisita();
        
    }
    
}
