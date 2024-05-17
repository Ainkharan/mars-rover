package marsrover;

import java.util.Scanner;

public class Plateau {
    //int grid;

    public static String getPlateauGridInput(){
        // Take input of Plateau grid size
        String plateauGrid =" " ;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter Plateau Grid Size as a square (X -> X*X) :");
                plateauGrid = scanner.nextLine();
                //scanner.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Data Try Again :");
                nfe.getMessage();
                scanner.nextLine();
            }

        return plateauGrid;
            }
    }

    public static String getPlateauLandingCoordinates() {
        // Take input of Plateau grid size
        String landingCoordinates = " ";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Plateau Landing coordinates in Format(int, int,N) :");
                landingCoordinates = scanner.nextLine();
                //scanner.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Data Try Again :");
                nfe.getMessage();
                scanner.nextLine();
            }

            return landingCoordinates;
        }
    }
}
