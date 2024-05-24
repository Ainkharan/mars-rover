package marsrover;

public class Rover {
    public Position position;
    public Plateau plateau;

    public Rover(Position position, Plateau plateau) {
        this.position = position;
        this.plateau = plateau;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    // Here implement the Rover Mving Methodes All in One or separate L R M

    public void movingInstructions(Instruction[] instructions){
        for (Instruction instruction : instructions){
            switch (instruction){
                case L: turningLeft(); break;
                case R : turningRight(); break;
                case M : moveOneGrid(); break;

            }
        }
    }
    public void turningLeft() {
        switch (position.getFacing()) {
            case N: position.setFacing(CompassDirection.W); break;
            case W: position.setFacing(CompassDirection.S);break;
            case S: position.setFacing(CompassDirection.E); break;
            case E: position.setFacing(CompassDirection.N);break;
        }
    }

    public void turningRight() {
        switch (position.getFacing()) {
            case N: position.setFacing(CompassDirection.E);break;
            case E: position.setFacing(CompassDirection.S);break;
            case S: position.setFacing(CompassDirection.W);break;
            case W:position.setFacing(CompassDirection.N);break;
        }
    }

    public void moveOneGrid() {

        int x = position.getX();
        int y = position.getY();

        switch (position.getFacing()) {

            case N: y += 1; break;  // position.getY() = position.getY()+  1;
            case E: x += 1; break;  //position.getX() = position.getX()+  1;
            case S: y -= 1; break;
            case W: x -= 1; break;
        }

        if (plateau.isWithinThePlateauGrid(x, y)) {
            position.setX(x);
            position.setY(y);
        }

    }
}

