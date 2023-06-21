
public class TestTennisSpielerin {

    public static void main(String[] args) {

        TennisSpielerin t1 = new TennisSpielerin();
        t1.setName("Maier");
        System.out.print("Name: " + t1.getName() + "\t");
        t1.setAlter(18);
        System.out.print("Alter: " + t1.getAlter() + "\t");
        t1.setStartNummer(44);
        System.out.println("Startnummer: " + t1.getStartNummer());

        TennisSpielerin t2 = new TennisSpielerin();
        t2.setName("Schmmid");
        System.out.print("Name: " + t2.getName() + "\t");
        t2.setAlter(45);
        System.out.print("Alter: " + t2.getAlter() + "\t");
        t2.setStartNummer(22);
        System.out.println("Startnummer: " + t2.getStartNummer());
        

        TennisSpielerin t3 = new TennisSpielerin();
        t3.setName("Berger");
        System.out.print("Name: " + t3.getName() + "\t");
        t3.setAlter(36);
        System.out.print("Alter: " + t3.getAlter() + "\t");
        t3.setStartNummer(44);
        System.out.println("Startnummer: " + t3.getStartNummer());
    }

}

