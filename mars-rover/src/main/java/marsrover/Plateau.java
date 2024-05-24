package marsrover;

public class Plateau {
    //int grid;
     int x;
     int y;

    public Plateau(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    // Only moving withing max x , y and (0, 0)- implement for Minus value once MVP Works
    public boolean isWithinThePlateauGrid(int xx, int yy) {
        return xx >= 0 && xx <= x && yy >= 0 && yy <= y;
    }
}

//    public static String getPlateauGridInput(){
//        // Take input of Plateau grid size
//        String plateauGrid =" " ;
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            try {
//                System.out.print("Enter Plateau Grid Size(square) (Format - X X) :");
//                plateauGrid = scanner.nextLine();
//                PlateauSize plateauSize = InputParser.parsePlateauSize(plateauGrid); // s1
//                System.out.println("Plateau Size Max Coordinates are  X:" + plateauSize.getX() + ", Y:" + plateauSize.getY());
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid Data Try Again :");
//                nfe.getMessage();
//                scanner.nextLine();
//            }
//
//        return plateauGrid;
//            }
//    }
//
//    public static String getPlateauLandingCoordinates() {
//        // Take input of Plateau grid size
//        String landingCoordinates = " ";
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                System.out.print("Enter Plateau Landing coordinates in Format(int, int,N) :");
//                landingCoordinates = scanner.nextLine();
//                //scanner.nextLine();
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid Data Try Again :");
//                nfe.getMessage();
//                scanner.nextLine();
//            }
//
//            return landingCoordinates;
//        }
//    }
//}
