import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Планета танданыз :\n" + "№1: Mercury,№2: Venera,№3: Ger,№4: Mars,№5: Jupiter,№6: Saturn,№7: Uranus,№8: Neptune");
        Scanner scanner = new Scanner(System.in);

        while (true) {
             int planeta = scanner.nextInt();       
            switch (planeta) {
                case 1:
                    System.out.println(Planetu.MERCURY+":En kichine planeta kungo jakun turat");
                    break;
                case 2:
                    System.out.println(Planetu.VENERA+":Slishkom jai ailanat");
                    break;
                case 3:
                    System.out.println(Planetu.GER+":Ger bul biz jashagan jer");
                    break;
                case 4:
                    System.out.println(Planetu.MARS+":Gerdin kopiasu birok al jakta jashoo jok");
                    break;
                case 5:
                    System.out.println(Planetu.JUPITER+":Plantalardun en chonu");
                    break;
                case 6:
                    System.out.println(Planetu.SATURN+":Oto ele jenil planeta eken  birok shakekchesi bar");
                    break;
                case 7:
                    System.out.println(Planetu.URANUS+":Shakekchesi bar birok bilbeim nege anusu kerek ");
                          break;
                case 8:
                    System.out.println(Planetu.NEPTUNE+":Munun dele shakekchesi bar al ne keregi bar ");
                    break;
                default:
                    System.out.println("Jo kechiresiz mundai planeta jok bolso tap alunuz ");
            }


        }


    }
}