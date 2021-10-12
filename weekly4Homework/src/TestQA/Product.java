package TestQA;

public class Product {
    public String isim;
    public String aciklama;
    public double fiyat;
    public double indirimliFiyat;

    public Product(String isim, String aciklama, double fiyat, double indirimliFiyat){
        this.isim = isim;
        this.aciklama=aciklama;
        this.fiyat=fiyat;
        this.indirimliFiyat = indirimliFiyat;
    }
}

