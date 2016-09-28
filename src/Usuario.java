import javax.swing.ImageIcon;
public class Usuario {

    private String nombre;

    private String apellido;

    private int cedula;

    private String correo;

    private String contrasena;

    private int repeticiones;

    private Partida nivelActual;

    private String fechaRegistro;

    private ImageIcon foto;

    private Historial historial;

    public Usuario(String nombre, String apellido, int cedula, String correo, String contrasena, int repeticiones, Partida nivelActual, String fechaRegistro, ImageIcon foto, Historial historial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
        this.repeticiones = repeticiones;
        this.nivelActual = nivelActual;
        this.fechaRegistro = fechaRegistro;
        this.foto = foto;
        this.historial = historial;
    }

    public void jugar() {
    }

    public void records() {
    }

    public void retar() {
    }

    public void crearGrupo() {
    }

    public void abandonarGrupo() {
    }

    public void continuarJuego() {
    }

    public void repetirNiveles() {
    }
//Gets and Sets

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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Partida getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(Partida nivelActual) {
        this.nivelActual = nivelActual;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
    
}
