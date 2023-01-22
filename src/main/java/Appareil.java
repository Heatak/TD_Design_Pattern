import java.util.ArrayList;
import java.util.List;

public class Appareil {
    private String nom;
    private float resultat = 0;

    private List<Piece> listePieces;

    public Appareil(String nom, List<Piece> listePieces){
        this.nom = nom;
        this.listePieces = listePieces;
    }

    public float getPrix() {

        for (Piece piece : listePieces) {
            resultat += piece.getPrix();
        }
        return resultat;
    }

    public void add(Piece piece) {
        listePieces.add(piece);
    }

    public void removePiece(Piece piece) {
        listePieces.remove(piece);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Piece> getListePieces() {
        return listePieces;
    }

    public void addPiece(Piece pieceUne){
        listePieces.add(pieceUne);
    }

    public void setListePieces(List<Piece> listePieces) {
        this.listePieces = listePieces;
    }
}
