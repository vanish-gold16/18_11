import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        System.out.println("For: ");
        for(int i = 1; i<101; i++){
            System.out.print(" " + i);
        }
        System.out.println("\n");
        while(b != 100){
            b++;
            System.out.print(" " + b);
        }
        System.out.println("\n");
        do{
            c++;
            System.out.print(" " + c);
        }while(c!=100);

        System.out.print("\n************************");

        Scanner scanner = new Scanner(System.in);

        int teplota = 1;
        int pocetTeplot = 0;
        int i = 0;
        int prumernaTeplota = 0;
        int nejvyssiTeplota = 0;
        int nejnizsiTeplota = 0;
        int druhaNejvyssiTeplota = 0;
        int druhaNejnizsiTeplota = 10000;
        do{
            i++;
            System.out.print("\nZadejte hodnotu " + i + ": ");
            teplota = scanner.nextInt();
            pocetTeplot++;
            prumernaTeplota+=teplota;
            if(teplota > nejvyssiTeplota){
                nejvyssiTeplota = teplota;
            }
            else if(teplota < nejnizsiTeplota){
                nejnizsiTeplota = teplota;
            }
            if(teplota < nejvyssiTeplota && teplota > druhaNejvyssiTeplota){
                druhaNejvyssiTeplota = teplota;
            }
            else if(teplota > nejnizsiTeplota && teplota < druhaNejnizsiTeplota){
                druhaNejnizsiTeplota = teplota;
            }
        }while(teplota!=0);
        prumernaTeplota = prumernaTeplota/pocetTeplot;
        System.out.print("\nPocet hodnot: " + pocetTeplot);
        System.out.print("\nPrumerna teplota v Kelvinech: " + prumernaTeplota + ". Teplota v " +
                "Celsiech: " + (prumernaTeplota - 273));
        System.out.print("\nNejvyssi teplota: " + nejvyssiTeplota);
        System.out.print("\nNejnizsi teplota: " + nejnizsiTeplota);
        System.out.print("\nDruha nejvyssi teplota: " + druhaNejvyssiTeplota);
        System.out.print("\nDruha nejnizsi teplota: " + druhaNejnizsiTeplota);

        System.out.print("\n************************");

        int pocetZletilych = 0;
        int nejstarsiVek = 0;
        String nejstarsiJmeno = "";
        String nejstarsiPrijmeni = "";

        for (int j = 1; j < 6; j++) {
            System.out.println("Zadejte udaje " + j + " studenta");
            scanner.nextLine();
            System.out.print("Jmeno: ");
            String jmeno = scanner.nextLine();
            System.out.print("\nPrijmeni: ");
            String prijmeni = scanner.nextLine();
            System.out.print("\nVek: ");
            int vek = scanner.nextInt();
            Student student = new Student(jmeno, prijmeni, vek);
            if(vek >= 18){
                pocetZletilych++;
            }
            if(vek > nejstarsiVek){
                nejstarsiVek = vek;
                nejstarsiJmeno = jmeno;
                nejstarsiPrijmeni = prijmeni;
            }
        }
        System.out.println("Pocet zletilych: " + pocetZletilych);
        System.out.println("Nejstarsi student je " + nejstarsiJmeno + " " + nejstarsiPrijmeni +
                ", a je " + nejstarsiVek + " let stary");

        System.out.print("\n************************");


    }
}