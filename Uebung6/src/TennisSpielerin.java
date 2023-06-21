
public class TennisSpielerin {

    private String name;
    private int alter;
    private int startNummer;

    //Getter
    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }
    public int getStartNummer() {
    	return startNummer;
    }

    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAlter(int newAlter) {
        this.alter = newAlter;
    }
    public void setStartNummer(int newStartNummer) {
    	this.startNummer = newStartNummer;
    }
}