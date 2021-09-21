
package proyecto;


public class Repartidor {
private long numdocumento;
private String nombre;
private String apellido;
private Zonasentrega [] zonas_entrega;
private String categoria;
private String username;
private String password;


public Repartidor(){
this.numdocumento=1003230069;
this.nombre="Luis";
this.apellido="Rojas";
this.categoria="B";
this.zonas_entrega=new Zonasentrega [3];
this.username="luisito@gmail.com";
this.password="luis2003";
}

    public long getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(long numdocumento) {
        this.numdocumento = numdocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Zonasentrega[] getZonas_entrega() {
        return zonas_entrega;
    }

    public void setZonas_entrega(Zonasentrega[] zonas_entrega) {
        this.zonas_entrega = zonas_entrega;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

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
}
