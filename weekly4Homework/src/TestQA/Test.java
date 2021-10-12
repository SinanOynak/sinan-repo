package TestQA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main (String[] args){
       Kategori meyveSebze = new Kategori("MeyveSebze");
       Kategori atistirmalik = new Kategori("atistirmalik");
       Kategori kahvaltilik = new Kategori("kahvaltilik");


        Kategori meyve = new Kategori("Meyve");
        Kategori sebze = new Kategori("Sebze");
        Kategori cips = new Kategori("cips");
        Kategori cikolata = new Kategori("cikolata");
        Kategori sut = new Kategori("süt");
        Kategori sarkuteri = new Kategori("sarkuteri");

        meyveSebze.altKategori.add(meyve);
        meyveSebze.altKategori.add(sebze);
        atistirmalik.altKategori.add(cips);
        atistirmalik.altKategori.add(cikolata);
        kahvaltilik.altKategori.add(sut);
        kahvaltilik.altKategori.add(sarkuteri);

        Product elma = new Product("elma","elmaTest",10,8);
        Product domates = new Product("domates","domatesTest",7,6);
        Product patlıcan = new Product("patlıcan","patlıcanTest",12,10);
        Product lays = new Product("lays","laysTest",4,2);
        Product peynir = new Product("peynir","peynirTest",10,7);

        meyve.urunler.add(elma);
        sebze.urunler.add(domates);
        sebze.urunler.add(patlıcan);
        cips.urunler.add(lays);
        sarkuteri.urunler.add(peynir);


        List<Kategori> categories = new ArrayList<>();
        categories.add(meyveSebze);
        categories.add(atistirmalik);
        categories.add(kahvaltilik);


        Person prs = new Person("Ahmet","ahmet","05552909999","Istanbul/Avcılar","1234");
        Person prs1 = new Person("Mehmet","mehmet","05552909998","Kocaeli/Gebze","1234+");


        List<Person> persons = new ArrayList<>();
        persons.add(prs);
        persons.add(prs1);

     Scanner scn = new Scanner(System.in);
     System.out.println("Kullanıcı adı:");
     String kullaniciAdi = scn.nextLine();

     System.out.println("Sifre:");
     String sifre = scn.nextLine();

     Person girisYapan = null;
  boolean control = false;
     for (Person p: persons
          ) {
      if (p.user.equals(kullaniciAdi) && p.password.equals(sifre)){
       control = true;
       girisYapan = p;
       break;

      }

     }
     if(!control){
      System.out.println("başarısız"); return;}

     System.out.println("1-Ana Menu");
     System.out.println("2-Arama");
     System.out.println("3-Profil");
    //en ucuz urun
     int secim = Integer.parseInt( scn.nextLine());


     switch (secim){
      case 1:
       int i = 0;
       for (Kategori k:categories
            ) {
         System.out.println((i+1)+" "+k.isim);
         i++;
       }
       int secimKategori = scn.nextInt();
       secimKategori--;
       int j = 0;
       for (Kategori  altK: categories.get(secimKategori).altKategori
            ) {
         System.out.println((j+1)+" "+altK.isim);
         j++;
       }
       int secimAltKategori = scn.nextInt();
       secimAltKategori--;
       break;
      case 2:
       System.out.println("arama için metin gir:");
       String aranacakMtin = scn.nextLine();
       int sayi = 1;
       for (Kategori k:categories
            ) {
        for (Kategori altK: k.altKategori
             ) {
         for (Product urun: altK.urunler
              ) {
            if(urun.isim.contains(aranacakMtin)){
             System.out.println(sayi+" "+urun.isim);
             sayi++;
            }
          int secimUrun = Integer.parseInt( scn.nextLine());
         }

        }

       }
       break;
      case 3:
       System.out.println(girisYapan.isim);
       System.out.println(girisYapan.adres);
       System.out.println(girisYapan.telefon);
       break;
     }


    }

}
