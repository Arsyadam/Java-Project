package inheritance;

public class Main {
    public static void main(String[] args) {
       BangunRuang bangunRuang = new BangunRuang();

       Kubus kubus = new Kubus();
       kubus.sisi =5;

       Bola bola = new Bola();
       bola.r =22;


       LimasSegitiga limasSegitiga = new LimasSegitiga();
       limasSegitiga.luas_alas = 20;
       limasSegitiga.tinggi = 8;

       Tabung tabung = new Tabung();
       tabung.r = 21;
       tabung.tinggi = 10;

       kubus.volume();
       tabung.volume();
       limasSegitiga.volume();
       bola.volume();

    }
}