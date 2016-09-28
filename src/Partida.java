public class Partida {

    private Matriz matrizAtras1;

    private Matriz MatrizAtras2;

    private Matriz matrizNivel;

    private int tiempo;

    private int movimiento;

    private int deshacer;

    private int movibles;

    public Partida(Matriz matrizAtras1, Matriz MatrizAtras2, Matriz matrizNivel, int tiempo, int movimiento, int deshacer, int movibles) {
        this.matrizAtras1 = matrizAtras1;
        this.MatrizAtras2 = MatrizAtras2;
        this.matrizNivel = matrizNivel;
        this.tiempo = tiempo;
        this.movimiento = movimiento;
        this.deshacer = deshacer;
        this.movibles = movibles;
    }

    public void checkGameOver() {
    }

    public void mover() {
    }

    public void cambiarNivelesOptimizados() {
    }

    public void jugarNivel() {
    }

    public void generarHistorial() {
    }

    public void salirJuego() {
    }

    public void verificarMovimiento() {
    }

    public void repetirNivel() {
    }

    public void CtrlZ() {
    }
//Gets and Sets

    public Matriz getMatrizAtras1() {
        return matrizAtras1;
    }

    public void setMatrizAtras1(Matriz matrizAtras1) {
        this.matrizAtras1 = matrizAtras1;
    }

    public Matriz getMatrizAtras2() {
        return MatrizAtras2;
    }

    public void setMatrizAtras2(Matriz MatrizAtras2) {
        this.MatrizAtras2 = MatrizAtras2;
    }

    public Matriz getMatrizNivel() {
        return matrizNivel;
    }

    public void setMatrizNivel(Matriz matrizNivel) {
        this.matrizNivel = matrizNivel;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getDeshacer() {
        return deshacer;
    }

    public void setDeshacer(int deshacer) {
        this.deshacer = deshacer;
    }

    public int getMovibles() {
        return movibles;
    }

    public void setMovibles(int movibles) {
        this.movibles = movibles;
    }
    
}
