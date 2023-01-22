public class Main {
    public static void main(String[] args) {


//      Type machine : Machine a Laver -> Lavetou
        AppareilFactory AppFactory= new AppareilFactory();
        Appareil machineALaver = AppFactory.createAppareil("machineALaver");
        System.out.println("Nom Machine : " + machineALaver.getNom() + ". \nPièce(s) : " + machineALaver.getListePieces() + ". \nCoûts de production : " + machineALaver.getPrix() + "€.");


//      Type machine : Brosse a dents -> Quenotte 3000
        Appareil brosseADents = AppFactory.createAppareil("brosseADents");
        System.out.println("Nom Machine : " + brosseADents.getNom() + ". \nPièce(s) : " + brosseADents.getListePieces() + ". \nCoûts de production : " + brosseADents.getPrix() + "€.");



//        Test si type appareil non existant
//        Appareil balai = AppFactory.createAppareil("balai");
//        System.out.println(balai.getNom());
    }
}
