package inheritance;

public class LimasSegitiga extends BangunRuang {
    float luas_alas;
    float tinggi;

    @Override
    float volume(){
        float volume = (float) (luas_alas * tinggi/3);
        System.out.println("Volume Limas Segitiga: " + volume);
        return volume;
    }

}