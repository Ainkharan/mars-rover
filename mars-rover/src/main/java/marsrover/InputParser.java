package marsrover;

public class InputParser {

    // Classs to supply input
    public static PlateauSize setPlateauSize(String plateauGrid) {

        // try {
        System.out.println(plateauGrid);
        String[] input = plateauGrid.split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        if(x != y){
            System.out.println("Invalid coordinates Enter Again:");
            Plateau.getPlateauGridInput();
        }
        return new PlateauSize(x, y);
    }

    // Set Plateau Lading coordinates with value input by user and validation
    public static RoverPosition setPlateauLandingCoordinates(String plateauGrid) {

        // try {
        System.out.println(plateauGrid);
        String[] input = plateauGrid.split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        CompassDirection facingDirection = CompassDirection.valueOf(input[2]);
        return new RoverPosition(x, y, facingDirection);
    }
}


