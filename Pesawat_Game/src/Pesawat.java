

import java.util.Scanner;
public class Pesawat {
        public static void main(String[] args) {
            Pilot player = new Pilot();

            Scanner input = new Scanner(System.in);

            player.merek = "Airbus A380-800 ";
            player.energi = 25;
            player.kecepatan = 30;
            player.ketinggian = 0;
            player.status = "engine off";

            while (player.energi != 0) {

                player.intro();
                System.out.println();
                player.option();

                System.out.println();
                System.out.println();
                System.out.print("Enter: ");
                int enter = input.nextInt();

                switch(enter) {
                    case 1:
                        player.intro();
                        break;

                    case 2:
                        player.nyalakanMesin();
                        player.status = "engine on";
                        break;

                    case 3:
                        player.matikanMesin();
                        player.status = "engine off";
                        break;

                    case 4:
                        if(player.status.contentEquals("engine on")) {
                            player.terbang();
                        }
                        else {
                            System.out.println("Nyalain dulu lah engine nya :)");
                        }
                        break;

                    case 5:
                        if(player.status.contentEquals("engine on")) {
                            player.turun();
                        }
                        else {
                            System.out.println("Nyalain dulu lah engine nya bang :)");
                        }
                        break;

                    case 6:
                        if(player.status.contentEquals("engine on")) {
                            player.belok();
                        }
                        else {
                            System.out.println("Nyalain dulu lah engine nya bang :)");
                        }
                        break;

                    case 7:
                        if(player.status.contentEquals("engine on")) {
                            player.mundur();
                        }
                        else {
                            System.out.println("Nyalain dulu lah engine nya bang :)");
                        }
                        break;

                    case 8:
                        System.exit(0);
                }

                System.out.println();
                System.out.println();

            }
        }
    }
