package marsrover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Refactor all by putting into respective classes. create Instances and Abstract Methode to Practice.
           Try to use final and private to not to change coordinates*/

        Scanner scanner = new Scanner(System.in);

        // Take input of Plateau grid size
//        while (true) {
//            try {
                System.out.print("Enter Plateau Grid Size(square) (Format - X X) :");
                String plateauSizeInput = scanner.nextLine();
                PlateauSize plateauSize = InputParser.setThePlateauSize(plateauSizeInput);
                Plateau plateau = new Plateau(plateauSize.getX(), plateauSize.getY());
                System.out.println("Plateau Size Max Coordinates are  X:" + plateauSize.getX() + ", Y:" + plateauSize.getY());
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid Data Try Again :");
//                nfe.getMessage();
//                scanner.nextLine();
//            }
      //  }

        // Take input of Plateau grid size
        System.out.print("Enter Platuea Landing coordinates in Format(int, int,N) :");
        String positionInput = scanner.nextLine();
        Position position = InputParser.landingCoordinatePosition(positionInput);
        System.out.println("Plateau Landing Coordinates are X:"+ position.getX()+ ", Y:" + position.getY()+ ", Facing :"+ position.getFacing());

        // Read and parse instructions
        System.out.print("Enter Rover Movement instruction (L M R) :");
        String instructionsInput = scanner.nextLine();
        Instruction[] instructions = InputParser.roverMovementInstructions(instructionsInput);
        System.out.print("Rover Movement instruction is :");
        for (int i = 0; i <instructions.length ; i++) {
            System.out.print( instructions[i]); // +s3
        }
        System.out.print("\nRover Starts From :X"+ position.getX()+ ", Y:" + position.getY()+ ", Facing On :"+ position.getFacing());

        // Call Rover to Move as per the instruction
        Rover rover = new Rover(position, plateau);
        rover.movingInstructions(instructions);

        // Display the Rover Last Position
        Position roverLastPosition = rover.getPosition();
        System.out.println(" and Reach the Final Position to : X:" +roverLastPosition.getX() + " Y:" + roverLastPosition.getY() + " Facing On :" + roverLastPosition.getFacing());


//        Scanner sc = new Scanner(System.in);
//        //String s1 = "5 5";
//        //String s2 = "1 2 N";
//        String s3 = "LMLMMLLMMMR";
//
//        // Take input of Plateau grid size
//        //String plateauGrid = "5 5";
//
//        // Get input from user by scanner
//        String plateauGrid = Plateau.getPlateauGridInput();
////        PlateauSize plateauSize = InputParser.setPlateauSize(plateauGrid); // s1
////        System.out.println("Plateau Size Max Coordinates are  X:" + plateauSize.getX() + ", Y:" + plateauSize.getY());
//
//        // Take input for Landing Cordinates
//        String landingCoordinates = Plateau.getPlateauLandingCoordinates();
//        Position position = InputParser.parsePosition(landingCoordinates); // s2
//        System.out.println("Plateau Landing Coordinates are X:"+ position.getX()+ ", Y:" + position.getY()+ ", Facing :"+ position.getFacing());
//
//        // Take input for Rover Movement instruction
//        //System.out.println("Enter Rover Movement instruction (L M R) :");
//
//        String instructionInput= sc.nextLine();
//
//        Instruction[] roverMovementInstruction = InputParser.parseInstruction(instructionInput); //  s3
//        System.out.println("Rover Movement instruction is :" +instructionInput ); // +s3
//        //System.out.println(Instruction.valueOf("L"));
//


                // Input Layer and validation - Shouldnt accept anything other than required
                // Plateau is a grid so its -  whole number (int / long) check within the grid square box
                //

            }
        }