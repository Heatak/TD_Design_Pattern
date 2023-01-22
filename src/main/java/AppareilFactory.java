import java.util.ArrayList;
import java.util.List;

public class AppareilFactory {

    public static String QUENOTTE3000;
    public static String LAVETOU;

    public Appareil createAppareil(String type) {
        Appareil appareil;
        List<Piece> listePieces = new ArrayList<>();


        switch (type) {
            case "brosseADents" -> {

                listePieces.add(new Piece("Brosse", 5));
                listePieces.add(new Piece("Manche", 3));
                listePieces.add(new Piece("Batterie", 50));
                listePieces.add(new Piece("Coque", 2));
                listePieces.add(new Piece("Cable", 5));

                appareil = new Appareil("Quenotte3000", listePieces);
                Induction inductionOP = new Induction(appareil);
                inductionOP.setOption();
                Batterie batterieOP = new Batterie(appareil);
                batterieOP.setOption();
                USB usbOP = new USB(appareil);
                usbOP.setOption();


//                System.out.println("OOF"+appareil.getListePieces());
            }
            case "machineALaver" -> {
                listePieces.add(new Piece("Moteur 200", 200));
                listePieces.add(new Piece("Tambour Premium", 100));

                appareil = new Appareil("Lavetou", listePieces);
                Secteur secteurOP = new Secteur(appareil);
                secteurOP.setOption();
            }
            default -> appareil = new Appareil("L'appareil n'est pas reconnu.",null);
        }
        return appareil;
    }
}
