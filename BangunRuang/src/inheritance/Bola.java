package inheritance;

public class Bola extends BangunRuang {
    float r;

    @Override
    float volume(){
        float volume = (float) (Math.PI * (r*r*r) * 4/3 );
        System.out.println("Volume bola: " + volume);
        return volume;
    }


}
