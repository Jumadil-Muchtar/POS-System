package kelas;
public class Produkk {
    public String nama ;
    private double harga;
    private boolean statusPromo ;
    private int diskon ;

    public Produkk(String namaParams, double hargaParams){
        this.nama = namaParams;
        this.harga = hargaParams;
        this.statusPromo= false;
        this.diskon = 0;
    }
    
    public void setPromo(boolean statusPromoParams, int diskon ){
        this.statusPromo = statusPromoParams;
        this.diskon = diskon;
    }
    public double getPromo() {
        if (statusPromo){
            return this.harga - (this.harga*this.diskon);
        }else{
            return 0.0;
        }
    }
    public double getHarga() {
        if(statusPromo){
            return this.getPromo();
        }
        return this.harga;
    }
    public void setHarga(double hargaParams){
        this.harga = hargaParams;
    }
    public boolean getStatusPromo(){
        return this.statusPromo;
    }
    



}
