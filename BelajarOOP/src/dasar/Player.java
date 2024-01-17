package dasar;
import java.util.Random;

public class Player {





    // definisi atribut
    String name;
    int stamina;
    int healthPoin;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Your stamina: "+ stamina);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)

//    boolean Attack(){
//        this.healthPoin =+ 32;
//    }

    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }

}