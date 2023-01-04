import java.util.ArrayList;
import java.util.Iterator;

public class dieMain {
    //private ArrayList<String> notes;
    // Storage for an arbitrary number of notes.
    private ArrayList<String> autoListe;
    private Auto moreattributes;


    //Erstelle ein Objekt für die Klasse ArrayList
    public dieMain() {
        autoListe = new ArrayList<String>();
        autoListe.add("Audi");
        autoListe.add("Ford");
        autoListe.add("BMW");
        autoListe.add("Mercedes");
        autoListe.add("Renault");
        autoListe.add("Toyota");
        autoListe.add("Honda");
        autoListe.add("Tesla");
        autoListe.add("Peugeout");
        autoListe.add("Citroen");

        }

    public void ausgabefor() {
        //size() geht auch
        for(int i=0; i < autoListe.toArray().length; i++){
            autoListe.get(i);
            System.out.print(i + " ");
            System.out.println(autoListe.get(i));
        }
    }

    public void ausgabeforeach() {
        for(String s : autoListe) {
            System.out.println(s);
        }
    }

    public void ausgabeIterator() {
        //Iterator-Ausgabe
        Iterator<String> it = autoListe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    //Methode für eine andere Klasse
    /*public void ausgabeClass() {
        moreattributes.setModel("RS3");
        //ausgabeforeach();
        System.out.println(moreattributes);
    }*/

    //MAIN
    public static void main(String[] args) {
        dieMain test = new dieMain();
        System.out.println("1.Ausgabe FOR");
        test.ausgabefor();
        System.out.println("------------------------------------------------");

        System.out.println("2.Ausgabe FOR-EACH");
        test.ausgabeforeach();
        System.out.println("------------------------------------------------");

        System.out.println("3.Ausgabe ITERATOR");
        test.ausgabeIterator();
        System.out.println("------------------------------------------------");

        // In development
        /*System.out.println("4.Ausgabe Über eine andere Klasse");
        test.ausgabeClass();*/

    }

}
