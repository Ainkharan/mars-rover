package marsrover;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    // Classs to supply input
    public static PlateauSize setThePlateauSize(String input) {
//        int x;
//        int y;

        while (true) {
            // try {
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
//            if (x != y | x < 0 || y < 0) {
//                System.out.println("Invalid coordinates Enter Again:");
//                Plateau.getPlateauGridInput();
//                //break;
//            }
            //} catch () {
            // }
            return new PlateauSize(x, y);
        }

   }

    // Set Plateau Lading coordinates with value input by user and validation
    public static Position landingCoordinatePosition(String input) {

        // try {

        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        CompassDirection facing = CompassDirection.valueOf(parts[2]);
        return new Position(x, y, facing);
    }

    // Set Instructions
    public static Instruction[] roverMovementInstructions(String input){
        char[] chars = input.toCharArray();
        List<Instruction> instructions = new ArrayList<>();
        for(char c : chars){
            instructions.add(Instruction.valueOf(String.valueOf(c)));
        }

//        Instruction[] instruction = new Instruction[input.toCharArray().length];
//        for (int i = 0; i < input.toCharArray().length; i++) {
//            instruction[i] = Instruction.valueOf(String.valueOf(input.toCharArray()[i]));
//        }
        return instructions.toArray(new Instruction[0]);
    }
}


