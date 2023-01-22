import java.util.List;

public class USB extends Option{
    private final float PRIX = 10;

    public USB(Appareil appareil) {
        super(appareil);
    }

    public USB(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }
    @Override
    public void setOption() {
        super.addPiece(new Piece("USB", PRIX));
    }
}
