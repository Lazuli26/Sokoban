import javax.swing.ImageIcon;

public class Administrador extends Usuario {

    private String nacionalidad;

    public Administrador (String nacionalidad, String nombre, String apellido, int cedula, String correo, String contrasena, int repeticiones, Partida nivelActual, String fechaRegistro, ImageIcon foto, Historial historial) {
        super(nombre, apellido, cedula, correo, contrasena, repeticiones, nivelActual, fechaRegistro, foto, historial);
        this.nacionalidad = nacionalidad;
    }

    public void crearNivel() {
    }

    public void eliminarNivel() {
    }

    public void cambiarOrdenNivel() {
    }
    
//Gets and Sets
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
