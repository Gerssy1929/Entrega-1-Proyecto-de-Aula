
package proyecto;


public class Zonasentrega {
private long zona;

public Zonasentrega(long zona){
this.zona=zona;

}

    public long getZona() {
        return zona;
    }

    public void setZona(long zona) {
        this.zona = zona;
    }

    
@Override
public String toString(){
    
return "Zona: "+this.zona;

}
}


