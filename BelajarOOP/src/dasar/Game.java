package dasar;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Game {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String[] KATA_PRABOWO = {"Saya tidak punya apa apa", "Mas Anies-Mas Anies", "Apalagi Antek asing, kau bela bela!!", "Omon-Omon","Oke-gas Oke-gas","Ndasmu Etik", "Sorry yee, Sorry yee"};
        String[] KATA_GANJAR = {"Ampunnnn DJ", "La Wong Saya suka kok", "Mediamu ae ra cetho kok", "PSI ki sopo? ","Kaisar Bapak Ramah Sekali","10 besar lulusan terbaik itu jadi dosen, Masa jadi MC", "Ngapin dicut, wong kurang keras kok"};
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_attack = rand.nextInt(32);
        int rand_defend = rand.nextInt(10);
        int rand_text = rand.nextInt(6);
         // Read user input


        // membuat objek player
        Player ganjar = new Player();

        // mengisi atribut player

        ganjar.name = "Ganjar (capres)";
        ganjar.stamina = 69;
        ganjar.healthPoin = 100;

        Player prabowo = new Player();

        // mengisi atribut player
        prabowo.name = "Prabowo (capres)";
        prabowo.stamina = 78;
        prabowo.healthPoin = 100;

        // menjalankan method

        System.out.println("1." + prabowo.name);
        System.out.println("2." + ganjar.name);
        System.out.print("Select your heros is:");


        int PLAYER = myObj.nextInt();
        int BASED_HP_ENEMY = 100;
        int BASED_HP_PLAYER = 100;
        int ATTACK_COUNT =0;
        int DEFEND_COUNT =0;



        if(PLAYER == 1) {
            System.out.println("======================================");
            System.out.println("You select " + prabowo.name+" as Hero");
            System.out.println("Your enemy " + ganjar.name);
            System.out.println("======================================");
            System.out.println();


//            System.out.println(KATA_PRABOWO[rand_text]);
        }else {
            int ENEMY = 1;
            System.out.println("======================================");
            System.out.println("You select " + ganjar.name +" as Hero");
            System.out.println("Your Enemy is " +prabowo.name );
            System.out.println("======================================");
            System.out.println();

        }
        System.out.println("Lets attack/defend");
        System.out.println("======================================");



        while (true) {



        System.out.print("choose your action: ");
        String action = myObj.nextLine();



        if (Objects.equals(action, "attack")) {
            ATTACK_COUNT =+1;
            DEFEND_COUNT =-1;
            System.out.println(DEFEND_COUNT);

            if (PLAYER == 2) {
                System.out.println(KATA_GANJAR[rand_text]);
                System.out.println("Kamu berhasil melawan Prabowo");

            }else {
                System.out.println(KATA_PRABOWO[rand_text]);
                System.out.println("Kamu berhasil melawan Ganjar");

            }
            BASED_HP_PLAYER+=rand_attack;
            BASED_HP_ENEMY-=rand_attack;
            System.out.println("HP Mu Saat ini:" + BASED_HP_PLAYER);
            System.out.println("HP Musuh saat ini: " + BASED_HP_ENEMY);
            System.out.println("======================================");

        } else if (Objects.equals(action, "defend")) {
            ATTACK_COUNT =-1;
            DEFEND_COUNT =+1;
            if (PLAYER == 2) {
                System.out.println(KATA_GANJAR[rand_text]);
                System.out.println("Kamu berhasil berlindung dari Prabowo");

            }else {
                System.out.println(KATA_PRABOWO[rand_text]);
                System.out.println("Kamu berhasil berlindung dari Ganjar");

            }
            BASED_HP_PLAYER-=rand_attack;
            BASED_HP_ENEMY+=rand_attack;
            System.out.println("HP Mu Saat ini:" + BASED_HP_PLAYER);
            System.out.println("HP Musuh saat ini: " + BASED_HP_ENEMY);
            System.out.println("======================================");

        }
            if(ATTACK_COUNT >= 3) {
                System.out.println("WADU WADU kamu blunder");
                System.out.println("Kebanyakan attack terus");
                BASED_HP_PLAYER+=rand_attack;
                BASED_HP_ENEMY-=rand_attack;
                System.out.println("HP Mu Saat ini:" + BASED_HP_PLAYER);
                System.out.println("HP Musuh saat ini: " + BASED_HP_ENEMY);
            }

            if(DEFEND_COUNT >= 2) {
                System.out.println("WADU WADU kamu blunder");
                System.out.println("Kebanyakan attack terus");
                BASED_HP_PLAYER+=rand_attack;
                BASED_HP_ENEMY-=rand_attack;
                System.out.println("HP Mu Saat ini:" + BASED_HP_PLAYER);
                System.out.println("HP Musuh saat ini: " + BASED_HP_ENEMY);
            }
            if (BASED_HP_ENEMY <= 0 ) {
                System.out.println("HP Musuh Tersisa: 0");
                System.out.println("KAMU MENANGG!!!");
                break;
            } else if (BASED_HP_PLAYER  <= 0) {
                System.out.println("HP Kamu Tersisa: 0");
                System.out.println(" ----------------------------------------");
                System.out.println("| Hahahahhyuk, Sayang sekali kamu kalah  |");
                System.out.println(" ----------------------------------------");
            }
        }

        if(prabowo.isDead()){
            System.out.println("Dawai");
        }

    }
}