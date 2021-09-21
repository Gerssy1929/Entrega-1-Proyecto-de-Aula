
package proyecto;


public class Cliente {
private String nombre;
private String apellido;
private String calle_carrera;
private String numcasa;
private long codpostal;
private long telefono;
private long id;

public Cliente(){
this.nombre="German";
this.apellido="Ardila";
this.calle_carrera="Diagonal 23";
this.numcasa="34-77";
this.codpostal=200001;
this.telefono=5749148;
this.id=1003234282;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCalle_carrera() {
        return calle_carrera;
    }

    public void setCalle_carrera(String calle_carrera) {
        this.calle_carrera = calle_carrera;
    }

    public String getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(String numcasa) {
        this.numcasa = numcasa;
    }

    public long getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(long codpostal) {
        this.codpostal = codpostal;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
  
}
