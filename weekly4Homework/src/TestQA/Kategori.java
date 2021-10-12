package TestQA;

import java.util.ArrayList;
import java.util.List;

public class Kategori{
    public String isim;
    public List<Kategori> altKategori = new ArrayList<>();
    public List<Product> urunler =  new ArrayList<>();

    public Kategori(String isim){
        this.isim = isim;
    }
}
