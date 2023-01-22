public class Piece extends Component{
    private String nom;
    private float prix;

    public Piece(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public float getPrix() {
        return this.prix;
    }
}
