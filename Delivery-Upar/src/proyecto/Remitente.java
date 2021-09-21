
package proyecto;


public class Remitente {
private String nombre;
private String apellido;
private String calle_carrera;
private String numcasa;
private String pais;
private String ciudad;
private long telefono;

public Remitente(){
this.nombre="Rodolfo";
this.apellido="Cuello";
this.calle_carrera="Avd. de francia,";
this.numcasa="67";
this.telefono=98760952;
this.pais="España";
this.ciudad="Valencia";


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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

}
