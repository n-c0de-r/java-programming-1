
public class Punkt {
    private int x;
    private int y;
    public void setX (int i) {
        x = i;
    }
    public void setY (int i) {
        y= i;
    }

    public void verschiebe(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public void verschiebeUmEins(int x, int y) {
        verschiebe(1,1);
    }

    public boolean istUrsprung(int x, int y) {
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}