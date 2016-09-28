import java.util.ArrayList; 
public class PrincipalSokoban {

    private ArrayList Niveles;

    private ArrayList Usuarios;

    private Usuario jugadorActual;

    public PrincipalSokoban(ArrayList Niveles, ArrayList Usuarios, Usuario jugadorActual) {
        this.Niveles = Niveles;
        this.Usuarios = Usuarios;
        this.jugadorActual = jugadorActual;
    }

    public void imprimirGanesOptimos() {
    }

    public void imprimirRecordsRotos() {
    }

    public void imprimirHistorialJugador() {
    }

    public void imprimirUsuariosSuperanNivel() {
    }

    public void crearUsuario() {
    }

    public void borrarUsuario() {
    }

    public void buscarUsuario() {
    }

    public void cambiarReglas() {
    }

    public void cambiarAsignacionNivel() {
    }

    public void jugarGrupo() {
    }

    public void crearGrupo() {
    }
    
//Gets and Sets

    public ArrayList getNiveles() {
        return Niveles;
    }

    public void setNiveles(ArrayList Niveles) {
        this.Niveles = Niveles;
    }

    public ArrayList getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList Usuarios) {
        this.Usuarios = Usuarios;
    }

    public Usuario getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Usuario jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    
}
