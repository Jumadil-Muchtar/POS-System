package abstrak;

import java.util.ArrayList;

import kelas.Produkk;


public abstract class Toko {
    public ArrayList<Produkk> daftarProduk ;
    public String namaToko;
    public double saldo;

    

    public void lihatDaftarProduk(){
        System.out.println("Daftar produk toko "+namaToko +" : ");
        for (int i = 0; i < daftarProduk.size(); i++) {
            // System.out.println((i+1)+". "+daftarProduk.get(i).nama +" (Rp."+daftarProduk.get(i).getHarga()+")");
            System.out.printf("%1d. %2s (%3.2f) \n", (i+1),daftarProduk.get(i).nama, +daftarProduk.get(i).getHarga());
        }
    }
    public abstract void welcome();
}
