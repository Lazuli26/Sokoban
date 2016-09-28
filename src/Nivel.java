import java.util.ArrayList; 
public class Nivel {

    private Matriz matrizEntidad;

    private ArrayList records;

    private Usuario Autor;

    private int bestMove;

    public Nivel(Matriz matrizEntidad, ArrayList records, Usuario Autor, int bestMove) {
        this.matrizEntidad = matrizEntidad;
        this.records = records;
        this.Autor = Autor;
        this.bestMove = bestMove;
    }

    public void crearMatriz() {
    }
//Gets and Sets

    public Matriz getMatrizEntidad() {
        return matrizEntidad;
    }

    public void setMatrizEntidad(Matriz matrizEntidad) {
        this.matrizEntidad = matrizEntidad;
    }

    public ArrayList getRecords() {
        return records;
    }

    public void setRecords(ArrayList records) {
        this.records = records;
    }

    public Usuario getAutor() {
        return Autor;
    }

    public void setAutor(Usuario Autor) {
        this.Autor = Autor;
    }

    public int getBestMove() {
        return bestMove;
    }

    public void setBestMove(int bestMove) {
        this.bestMove = bestMove;
    }
    
}
