package marsrover;

public class PlateauSize {
    // X Y Coordinates of the grid check here for max and min grid size
    int x;
    int y;

// Constructor
    public PlateauSize(int x, int y) {
        this.x = x;
        this.y = y;
    }

// Getters and Setters
    public  int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
