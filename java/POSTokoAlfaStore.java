package kelas;
import java.util.ArrayList;

import abstrak.*;
import antarmuka.*;

class POSTokoAlfaStore extends Toko implements PointOfSale{
     
    public ArrayList<ItemBelanja> listBelanja;
    public ArrayList<ArrayList<ItemBelanja>> historyTransaksi;
    public double totalTransaksi = 0.0;


    public POSTokoAlfaStore(double modal){
        this.namaToko = "AlfaStore";
        this.saldo = modal;
        this.daftarProduk = new ArrayList<>();
        this.historyTransaksi = new ArrayList<>();

    }
    
    public void inputDaftarProduk(ArrayList<Produkk> daftarProdukk){
        this.daftarProduk = daftarProdukk;
    }
    public void bayar(double uangPelanggan){
        if (uangPelanggan >= this.totalTransaksi){
            double kembalian = uangPelanggan - this.totalTransaksi;
            System.out.printf("Transaksi berhasil, sisa uang kembalian pelanggan : \nRp. %.2f \n",kembalian);
            simpanDaftarBelanjaan(this.listBelanja);
        } else{
            System.out.println("Transaksi gagal, uang pelangaan tidak mencukupi transaksi ini");
            System.out.printf("Total transaksi : Rp. %.2f ", this.totalTransaksi);
            System.out.printf("Total uang pelanggan : Rp. %.2f", uangPelanggan);
            System.out.printf("Sisa yang harus dibayarkan : Rp. %.2f", this.totalTransaksi - uangPelanggan);
        }
    }
    private void simpanDaftarBelanjaan(ArrayList<ItemBelanja> listBelanjaa) {
        historyTransaksi.add(listBelanjaa);
    }
    
    @Override
    public void welcome(){
        System.out.printf("Selamat datang di Toko %s\n", this.namaToko);
    }
    @Override
    public void inputDaftarBelanjaanBaru(ArrayList<ItemBelanja> listBelanjaBaru){
        this.listBelanja = listBelanjaBaru;
    }
    @Override
    public void hitungTotalBelanja(){
        if (listBelanja.size() > 0) {
            double count = 0.0;
            for (int index = 0; index < listBelanja.size(); index++) {
                count += listBelanja.get(index).getTotalHarga();
            }
            this.totalTransaksi = count;
        }else{
            this.totalTransaksi = 0.0;
        }
    }
    
    @Override
    public void cekHistoryTransaksi() {
        System.out.println("History Transaksi :");
        for (int i = 0; i < historyTransaksi.size(); i++) {
            double count = 0.0;
            System.out.println("Transaksi "+(i+1));
            for (int j = 0; j < historyTransaksi.get(i).size(); j++) {
                ItemBelanja item = historyTransaksi.get(i).get(j);
                System.out.println(" "+item.detailItem());
                count += item.getTotalHarga();
            }
            System.out.printf("Total : %.2f\n", count);
        }
    }
    
    @Override
    public void cetakStruk() {
        double count = 0.0;
        System.out.printf("Struk Belanja  %s\n",this.namaToko);
        for (int j = 0; j < listBelanja.size(); j++) {
            ItemBelanja item = listBelanja.get(j);
            System.out.println(" "+item.detailItem());
            count += item.getTotalHarga();
        }
        System.out.printf("Total : %.2f\n", count);
    }





}
