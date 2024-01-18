package inheritance;

public class Kubus extends BangunRuang {
    float sisi;

    @Override
    float volume(){
        float volume = (float) (sisi*sisi*sisi);
        System.out.println("Volume Kubus: " + volume);
        return volume;
    }
}
