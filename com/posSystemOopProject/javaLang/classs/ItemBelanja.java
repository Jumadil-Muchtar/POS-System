package com.posSystemOopProject.javaLang.classs;

public class ItemBelanja {
    private Produk produk ;
    private int jumlah;
    
    public ItemBelanja(Produk produkParams, int itemParams){
        this.produk = produkParams;
        this.jumlah = itemParams;
    }

    public double getHargaTotal(){
        if(this.produk.getStatusPromo()){
            return this.produk.getPromo() * this.jumlah;
        }else{
            return this.produk.getHarga()*jumlah;
        }
    }
}
