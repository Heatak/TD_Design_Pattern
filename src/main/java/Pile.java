import java.util.List;

public class Pile extends Option {
    private final float PRIX = 5;

    public Pile(Appareil appareil){
        super(appareil);
    }

    public Pile(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }

    @Override
    public void setOption() {
        super.addPiece(new Piece("Pile", PRIX));
    }
}
