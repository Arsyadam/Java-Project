package inheritance;

public class Tabung extends BangunRuang {
        float r;
        float tinggi;

        @Override
        float volume(){
                float volume = (float) (Math.PI * (r*r) * tinggi);
                System.out.println("Volume tabung: " + volume);
                return volume;
        }
}
