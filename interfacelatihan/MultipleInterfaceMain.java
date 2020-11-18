package interfacelatihan;

/**
 *
 * @author Aulafz
 */
public class MultipleInterfaceMain {

    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        sarjanaCum.menjuaraiKompetisi();
        sarjanaCum.membuatPublikasiilmiah();
        System.out.println("--------------------------------------------");
        pakRektor.beriSertifikatMawapres(masterCum);
        masterCum.menjuaraiKompetisi();
        masterCum.membuatPublikasiilmiah();
        System.out.println("--------------------------------------------");
    }
}
