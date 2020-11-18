package interfacelatihan;

/**
 *
 * @author Aulafz
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println();
    }

}
