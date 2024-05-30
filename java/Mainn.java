package kelas;
import java.util.ArrayList;
import kelas.Produkk;
import kelas.ItemBelanja;
public class Mainn {
    public static void main(String[] args) {
        POSTokoAlfaStore obj = new POSTokoAlfaStore(10000.0);
        obj.inputDaftarProduk(getListProduk());
        obj.inputDaftarBelanjaanBaru(getDaftarBelanja());
        obj.bayar(50000.00);
        obj.cetakStruk();

    }
    public static ArrayList<Produkk> getListProduk(){
        ArrayList<Produkk> listProduk = new ArrayList<>();
        listProduk.add(new Produkk("Kerupuk Qtela", 5000.00));
        listProduk.add(new Produkk("Coca cola", 6000.00));
        listProduk.add(new Produkk("Air Mineral", 5000.00));
        return listProduk;
    }
    public static ArrayList<ItemBelanja> getDaftarBelanja(){
        ArrayList<Produkk> listtProdukk = getListProduk();
        ArrayList<ItemBelanja> daftarBelanjaa = new ArrayList<>();
        daftarBelanjaa.add(new ItemBelanja(listtProdukk.get(1), 1));
        daftarBelanjaa.add(new ItemBelanja(listtProdukk.get(2), 1));
        daftarBelanjaa.add(new ItemBelanja(listtProdukk.get(0), 2));
        return daftarBelanjaa;
    }
    
}
