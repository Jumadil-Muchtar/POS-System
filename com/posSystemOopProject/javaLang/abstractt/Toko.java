package com.posSystemOopProject.javaLang.abstractt;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.posSystemOopProject.javaLang.classs.Produk;

public abstract class Toko {
    ArrayList<Produk> daftarProduk ;
    String namaToko;
    double saldo;

    abstract void welcome();

    void lihatDaftarProduk(){
        System.out.println("Daftar produk toko "+namaToko +" : ");
        for (int i = 0; i < daftarProduk.size(); i++) {
            // System.out.println((i+1)+". "+daftarProduk.get(i).nama +" (Rp."+daftarProduk.get(i).getHarga()+")");
            System.out.printf("%1d. %2s (%3.2f) \n", (i+1),daftarProduk.get(i).nama, +daftarProduk.get(i).getHarga());
        }
    }
}
