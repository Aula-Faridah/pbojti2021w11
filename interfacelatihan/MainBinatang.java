package interfacelatihan;

/**
 *
 * @author Aulafz
 */
public class MainBinatang {

    public static void main(String[] args) {
        Keledai k = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorilla g = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa s = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        k.displayData();
        g.displayData();
        s.displayData();
    }
}
