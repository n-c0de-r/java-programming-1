
public class ErweiterungPunkt {
	 
    public static void main(String[] args) {
        // Erzeugen von p2 und p3
        Punkt p2 = new Punkt(2, 2);
        Punkt p3 = new Punkt(7, -1);

        // Ausgeben der Koordinaten von p2 und p3
        System.out.println("Koordinaten von p2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("Koordinaten von p3: (" + p3.x + ", " + p3.y + ")");

        // Verschieben von p2 um einen Vektor, um mit p3 übereinzustimmen
        int deltaX = p3.x - p2.x;
        int deltaY = p3.y - p2.y;
        p2.verschieben(deltaX, deltaY);

        // Ausgeben der neuen Koordinaten von p2
        System.out.println("Koordinaten von p2 nach der Verschiebung: (" + p2.x + ", " + p2.y + ")");
        
    }
}

class Punkt {
    public int x;
    public int y;
    
    public static final int UNTERGRENZE = 10;
    public static final int OBERGRENZE = -10;
    
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void verschieben(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
    
    public void verschiebeInnerhalb(int deltaX, int deltaY) {
        int newX = this.x + deltaX;
        int newY = this.y + deltaY;
        if (newX >= OBERGRENZE && newX <= UNTERGRENZE && newY >= OBERGRENZE && newY <= UNTERGRENZE) {
            this.verschieben(deltaX, deltaY);
        }
    }
}