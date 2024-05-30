package antarmuka;
import java.util.ArrayList;
import kelas.*;

import kelas.ItemBelanja;


public interface PointOfSale {
    void inputDaftarBelanjaanBaru(ArrayList<ItemBelanja> listBelanjaBaru);
    void hitungTotalBelanja();
    void cekHistoryTransaksi();
    void cetakStruk();
      
}
