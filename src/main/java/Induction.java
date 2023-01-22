import java.util.List;

public class Induction extends Option{
    private final float PRIX = 30;

    public Induction(Appareil appareil) {
        super(appareil);
    }

    public Induction(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }

    @Override
    public void setOption() {
        super.addPiece(new Piece("Induction", PRIX));
    }
}
