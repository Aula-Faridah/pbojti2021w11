package interfacelatihan;

import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

/**
 *
 * @author Aulafz
 */
public class interfacemain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        pakrektor.beriSertifikatCumlaude((ICumlaude) mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        sarjanaCumlaude.kuliahDiKampus();
        sarjanaCumlaude.lulus();
        sarjanaCumlaude.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        masterCumlaude.kuliahDiKampus();
        masterCumlaude.lulus();
        masterCumlaude.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
    }
}
