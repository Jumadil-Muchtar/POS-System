package com.posSystemOopProject.javaLang.interfacee;

import java.util.ArrayList;

import com.posSystemOopProject.javaLang.classs.ItemBelanja;


public interface PointOfSale {
    void hitungDaftarBelanjaan(ArrayList<ItemBelanja> itemBelanjas);
    void simpanDaftarBelanjaan(ArrayList<ItemBelanja> itemBelanjas);
    ArrayList<ArrayList<ItemBelanja>> cekHistoryTransaksi();
    void cetakStruk();   
}
