package Manajemen_Kamar_Hotel;

class KamarSuite extends Kamar{
    private String RuangTamu = ", Ruang Tamu";
    private String Balkon = ", Balkon";
    private String Bathup = ", Bathup.";
    
    public KamarSuite(String NomorKamar, String JenisKasur){
        super (NomorKamar, "Suite", JenisKasur);
    }
    
    public String getFasilitasKamarSuite(){
        return getFasilitasDasar() + RuangTamu + Balkon + Bathup;
    }

    public void tampilkanFasilitas(){
        System.out.println("[-] Kamar Suite(S301 - S305)");
        System.out.println("    Fasilitas: " + getFasilitasKamarSuite() + "\n");
    }
}
