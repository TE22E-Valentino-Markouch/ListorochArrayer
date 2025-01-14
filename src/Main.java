import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






String[] leksaker = {"Hotwheels", "Lego", "Barbie", "Nerf", "Boll" };

String[] Klasskamrater = {"Filip", "Vincent", "Mikael", "Anton", "Damejan"};

        int[] femVärden = {1, 3, 5, 7, 9};


        for (int i = 0; i < leksaker.length; i++) {
            System.out.println(Klasskamrater[i] + " ger " + leksaker[i] + " betyget " + femVärden[i] + ".");
        }

ArrayList<String> cities = new ArrayList<String>();

while (true) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv in namnet på en stad: ");
    System.out.println("När du känner att det räcker så skriver du exit.");
    String stadNamn = scan.nextLine();

    if (stadNamn.toLowerCase().equals("exit")) {
        break;
    }
    cities.add(stadNamn);
}
    for (int i = 0; i < cities.size(); i++) {
        System.out.println(cities.get(i));
    }




    }
}
