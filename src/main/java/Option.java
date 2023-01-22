import java.util.List;

public class Option extends Appareil{

    private Appareil appareil;

    public Option(Appareil appareil) {
        super(appareil.getNom(), appareil.getListePieces());
    }
    public Option(String nom, List<Piece> listePieces) {
        super(nom, listePieces);
    }

    public void setOption(){};

}
