import java.util.ArrayList;
/*
Iterator:
has-next
next
*/

public class Auto {

    //private ArrayList<String> autoobjektListe;
    private String Model;
    private String Marke;
    private int Anzahl_PS;
    private int Kubik;
    private Farbe Farbe;
    private Typ Typ;


    public Auto(String Model, String Marke, int Anzahl_PS, int Kubik, Farbe Farbe, Typ Typ) {
        this.Model = Model;
        this.Marke = Marke;
        this.Anzahl_PS = Anzahl_PS;
        this.Kubik = Kubik;
        this.Farbe = Farbe;
        this.Typ = Typ;

    }

    //Setter und Getter für Model
    public String getModel() {
        return Model;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }

    //Setter und Getter für Marke
    public String getMarke() {
        return Marke;
    }
    public void setMarke(String Marke) {
        this.Marke = Marke;
    }


}
