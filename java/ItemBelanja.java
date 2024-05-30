package kelas;
public class ItemBelanja {
    private Produkk produk ;
    private int jumlah;
    
    public ItemBelanja(Produkk produkParams, int itemParams){
        this.produk = produkParams;
        this.jumlah = itemParams;
    }

    public Produkk getProduk(){
        return this.produk;
    }
    public int getJumlah(){
        return this.jumlah;
    }

    public double getTotalHarga(){
        if(this.produk.getStatusPromo()){
            return this.produk.getPromo() * this.jumlah;
        }else{
            return this.produk.getHarga()*this.jumlah;
        }
    }
    public String detailItem(){
        String detail = "";
        if(this.getProduk().getStatusPromo()) detail =" [PROMO]";
        detail = detail + String.format(" %1s  (%2d x %3.2f)", this.produk.nama, this.jumlah, this.produk.getHarga());
        return detail;
    }
}
