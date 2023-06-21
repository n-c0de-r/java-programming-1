
public class TestPunkt {

    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.setX(1); p1.setY(2);

        p1.verschiebe(2,2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1.verschiebe(1,-3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1.verschiebeUmEins(1,1);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Punkt p2 = new Punkt();
        p2.setX(3); p2.setY(5);
        p2.verschiebe(0,0);
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        Punkt p3 = new Punkt();
        p3.setX(2); p3.setY(4);
        System.out.println(p3.getX());
        System.out.println(p3.getY());
    }

}