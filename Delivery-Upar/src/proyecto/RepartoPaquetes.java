
package proyecto;


public class RepartoPaquetes {
private Repartidor repartidores;
private String estadopaquete;
   

public RepartoPaquetes(){
this.estadopaquete="Repartido";
this.repartidores=new Repartidor();
}

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }

    public Repartidor getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(Repartidor repartidores) {
        this.repartidores = repartidores;
    }
    
    public void repartirpaquetes(){
        System.out.println("Reparto de paquetes");
        System.out.println("Estado Actual Paquete: "+estadopaquete);
        System.out.println("\nDatos Repartidor"
        +"\nNum Documento: "+repartidores.getNumdocumento()
        +"\nNombre: "+repartidores.getNombre()
        +"\nApellido: "+repartidores.getApellido()
        +"\nZonas de entrega: ");
        for(int g=0;g<repartidores.getZonas_entrega().length;g++){           
        System.out.println(repartidores.getZonas_entrega()[g]);
        }
        System.out.println("Categoría:"+repartidores.getCategoria()
        +"\nUsuario: "+repartidores.getUsername()
        +"\nContraseña: "+repartidores.getPassword());
        System.out.println("-----------------------------------------------");
}

}
