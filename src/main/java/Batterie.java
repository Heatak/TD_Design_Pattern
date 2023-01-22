import java.util.List;

public class Batterie extends Option{
    private final float PRIX = 20;

    public Batterie(Appareil appareil) {
        super(appareil);
    }

    public Batterie(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }

    @Override
    public void setOption() {
        super.addPiece(new Piece("Batterie", PRIX));
    }
}
