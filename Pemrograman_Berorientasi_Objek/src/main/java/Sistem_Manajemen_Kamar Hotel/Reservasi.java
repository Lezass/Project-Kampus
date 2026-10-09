package Manajemen_Kamar_Hotel;

public class Reservasi {
    private String kodeReservasi;
    private Kamar kamar;
    private double tarifPerMalam;
    private static int jumlahReservasi = 0;

    public Reservasi(String kodeReservasi, Kamar kamar, double tarifPerMalam) {
        this.kodeReservasi = kodeReservasi;
        this.kamar = kamar;
        setTarifPerMalam(tarifPerMalam);
        jumlahReservasi++;
    }

    public Reservasi(String kodeReservasi, Kamar kamar) {
        this.kodeReservasi = kodeReservasi;
        this.kamar = kamar;
        this.tarifPerMalam = 350000.0;
        jumlahReservasi++;
    }

    public void setTarifPerMalam(double tarifPerMalam) {
        if (tarifPerMalam < 0) {
            System.out.println("Tarif tidak boleh negatif.");
        } else {
            this.tarifPerMalam = tarifPerMalam;
        }
    }

    public static int getJumlahReservasi() {
        return jumlahReservasi;
    }

    public void tampilkanInfo() {
        System.out.println("| KODE RESERVASI : " + kodeReservasi);
        System.out.println("| No. Kamar      : " + kamar.getNomorKamar());
        System.out.println("| Tipe Kamar     : " + kamar.getTipeKamar());
        System.out.println("| Kapasitas Kasur: " + kamar.getJenisKasur());
        System.out.println("| Tarif / Malam  : Rp" + tarifPerMalam);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

