package marsrover;

public class Main {
    public static void main(String[] args) {

        // Take input of Plateau grid size
        //String plateauGrid = "5 5";
        String plateauGrid = Plateau.getPlateauGridInput();
        PlateauSize plateauSize = InputParser.setPlateauSize(plateauGrid);
        System.out.println("Plateau Size Max Coordinates are  X:" + plateauSize.getX() + ", Y:" + plateauSize.getY());

        // Take input for Landing Cordinates
        String landingCoordinates = Plateau.getPlateauLandingCoordinates();
        RoverPosition roverPosition = InputParser.setPlateauLandingCoordinates(landingCoordinates);
        System.out.println("Plateau Landing Coordinates are X:"+roverPosition.getX()+ ", Y:" +roverPosition.getY()+ ", Facing :"+roverPosition.getFacing());

//        // Take input for Rover Movement instruction
//        System.out.println("Enter Rover Movement instruction (L M R) :");
//        Scanner roverMovement = new Scanner(System.in);
//        landingCordinates.next();
//        landingCordinates.nextLine();

        // Input Layer and validation - Shouldnt accept anything other than required
        // Plateau is a grid so its -  whole number (int / long) check within the grid square box
        //

    }
}