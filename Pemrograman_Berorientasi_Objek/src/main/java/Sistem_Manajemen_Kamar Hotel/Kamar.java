package Manajemen_Kamar_Hotel;

class Kamar {
    private String NomorKamar;
    private String TipeKamar;
    private String JenisKasur;
    
    public Kamar(String NomorKamar, String TipeKamar, String JenisKasur){
        this.NomorKamar = NomorKamar;
        this.TipeKamar = TipeKamar;
        this.JenisKasur = JenisKasur;
    }
    
    public String getNomorKamar(){
        return NomorKamar;
    }
    
    public String getTipeKamar(){
        return TipeKamar; 
    }
    
    public String getJenisKasur(){
        return JenisKasur;
    }
    
    public String getFasilitasDasar(){
        return "AC, TV, Kasur, Kamar Mandi, Wifi";
    }
}

