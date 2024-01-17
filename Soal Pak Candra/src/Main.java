import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static double mean(ArrayList<Double> m) {
        double sum = 0;
        for (double v : m) {
            sum += v;
        }

        return sum/m.size();
    }


    public static void main(String[] args) {
        ArrayList<Double> angka = new ArrayList<Double>();

        Scanner myObj = new Scanner(System.in);
        System.out.print("Angka Pertama: ");
        angka.add(myObj.nextDouble());
        System.out.print("Angka Kedua: ");
        angka.add(myObj.nextDouble());
        System.out.print("Angka Ketiga: ");
        angka.add(myObj.nextDouble());

        double rata = mean(angka);

        if (rata >= 10 && rata < 100 ) {
            System.out.println("Rata rata termasuk 'Nilai Puluhan'");
        } else if (rata > 100 && rata < 1000) {
            System.out.println("Rata rata termasuk 'Nilai Ratusan'");
        } else if (rata >= 1000 && rata < 10000) {
            System.out.println("Rata rata termasuk 'Nilai Ribuan' ");

        } else {
            System.out.println("Nilai Belum terdefinisi");
        }


        System.out.println("Hasil rata rata:" + rata);
    }
}