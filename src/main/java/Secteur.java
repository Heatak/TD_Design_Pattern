import java.util.List;

public class Secteur extends Option{
    private final float PRIX = 5;

    public Secteur(Appareil appareil) {
        super(appareil);
    }

    public Secteur(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }

    @Override
    public void setOption() {
        super.addPiece(new Piece("Secteur", PRIX));
    }
}
